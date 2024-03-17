import os
from base import app
from flask import render_template, request, redirect, jsonify, flash, url_for
from base.com.vo.product_vo import ProductVo
from base.com.dao.product_dao import ProductDao
from werkzeug.utils import secure_filename
from base.com.dao.subcategory_dao import SubCategoryDao
from base.com.dao.category_dao import CategoryDao

product_path = 'base/static/product_images/'
app.config['PRODUCT'] = product_path


@app.route('/addProduct')
def add_product():
    try:
        category_dao = CategoryDao()
        data = category_dao.search_category()
    except Exception as e:
        print(e)
        print("Fail to load Add Product")
    return render_template("addProduct.html", data=data)


@app.route('/getSubCategories')
def get_sub_category():
    try:
        id = request.args.get("id")
        product_dao = ProductDao()
        data = product_dao.get_sub_categories(id)
        sub_categories_list = [i.as_dict() for i in data]
    except Exception as e:
        print(e)
        print("Fail to load Add Product")
    return jsonify(sub_categories_list)


@app.route('/insertProduct', methods=["POST"])
def insert_product():
    try:
        product_name = request.form.get('productName')
        product_description = request.form.get('productDescription')
        product_price = request.form.get('productPrice')
        product_quantity = request.form.get('productQuantity')
        product_image = request.files.get('productImage')
        product_sub_category_id = request.form.get('subCategoryId')
        product_category_id = request.form.get('categoryId')

        product_image_name = secure_filename(product_image.filename)
        product_image_path = os.path.join(app.config['PRODUCT'], product_image_name)
        product_image.save(product_image_path)
        print(product_image_path)
        product_image_path = product_image_path.replace("base/", "../")
        print(product_image_path)

        product_vo = ProductVo()
        product_dao = ProductDao()

        product_vo.product_name = product_name
        product_vo.product_description = product_description
        product_vo.product_price = product_price
        product_vo.product_quantity = product_quantity
        product_vo.sub_category_id = product_sub_category_id
        product_vo.category_id = product_category_id
        product_vo.product_image_name = product_image_name
        product_vo.product_image_path = product_image_path

        product_dao.insert_product(product_vo)

    except Exception as ex:
        print(ex)
        print("Failed to insert Product")

    return redirect("/searchProduct", )


@app.route('/searchProduct')
def search_product():
    try:
        product_dao = ProductDao()
        data = product_dao.search_product()
    except Exception as ex:
        print(ex)
        print("Failed to Search Product")

    return render_template("viewProduct.html", data=data)


@app.route('/deleteProduct')
def delete_product():
    error = ""
    try:
        delete_id = request.args.get("id")
        product_dao = ProductDao()
        # data = product_dao.edit_product(delete_id)
        product_dao.delete_product(delete_id)
        return redirect("/searchProduct")
    except Exception as ex:
        print(ex)
        flash("Image File Not Found! Please Contact Administrator.")
        product_dao = ProductDao()
        data = product_dao.search_product()
        return redirect(url_for("search_product"))


@app.route('/editProduct')
def edit_product():
    try:
        edit_id = request.args.get("id")
        product_dao = ProductDao()
        data = product_dao.edit_product(edit_id)
        category_dao = CategoryDao()
        cat = category_dao.search_category()
        subcategory_dao = SubCategoryDao()
        subcat = subcategory_dao.search_subcategory()
    except Exception as ex:
        print(ex)
        print("Failed to Edit Product")

    return render_template("editProduct.html", subcat=subcat, cat=cat, data=data)


@app.route('/updateProduct', methods=["POST"])
def update_product():
    try:
        product_id = request.form.get('productId')
        product_name = request.form.get('productName')
        product_description = request.form.get('productDescription')
        product_price = request.form.get('productPrice')
        product_quantity = request.form.get('productQuantity')
        product_sub_category_id = request.form.get('subCategoryId')
        product_category_id = request.form.get('categoryId')
        product_image = request.files.get('productImage')
        product_image_name = secure_filename(product_image.filename)

        product_vo = ProductVo()
        product_dao = ProductDao()
        if product_image_name != "":
            delete_product_vo_obj = product_dao.edit_product(product_id)
            image_path = delete_product_vo_obj[0].product_image_path
            image_path = image_path.replace("..", "base")
            os.remove(image_path)

            product_image_path = os.path.join(app.config['PRODUCT'], product_image_name)
            product_image.save(product_image_path)
            print(product_image_path)
            product_image_path = product_image_path.replace("base/", "../")
            print(product_image_path)
            product_vo.product_image_name = product_image_name
            product_vo.product_image_path = product_image_path
        product_vo.product_id = product_id
        product_vo.product_name = product_name
        product_vo.product_description = product_description
        product_vo.product_price = product_price
        product_vo.product_quantity = product_quantity
        product_vo.sub_category_id = product_sub_category_id
        product_vo.category_id = product_category_id

        product_dao.update_product(product_vo)
    except Exception as ex:
        print(ex)
        print("Failed to Update the product")

    return redirect("/searchProduct")
