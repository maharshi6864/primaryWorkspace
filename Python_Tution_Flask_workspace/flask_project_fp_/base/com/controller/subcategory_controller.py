from base import app
from flask import render_template, request, redirect
from base.com.vo.category_vo import CategoryVo
from base.com.vo.subcategory_vo import SubCategoryVo
from base.com.dao.category_dao import CategoryDao
from base.com.dao.subcategory_dao import SubCategoryDao


@app.route('/addSubCategory')
def add_sub_category():  # put application's code here
    try:
        category_dao = CategoryDao()
        data = category_dao.search_category()
    except Exception as ex:
        print("Category Insert Fail!!" + ex)
    return render_template("addSubCategory.html", data=data)


@app.route('/insertSubCategory', methods=["POST"])
def insert_subcategory():
    try:
        sub_category_name = request.form.get('subCategoryName')
        sub_category_description = request.form.get('subCategoryDes')
        sub_category_category_id = request.form.get('categoryId')
        sub_category_vo = SubCategoryVo()
        sub_category_dao = SubCategoryDao()
        sub_category_vo.sub_category_name = sub_category_name
        sub_category_vo.sub_category_description = sub_category_description
        sub_category_vo.category_id = sub_category_category_id
        sub_category_dao.insert_subcategory(sub_category_vo)
        print(sub_category_category_id)
    except Exception as ex:
        print("Fail to insert sub_category!!")
        print(ex)
    return redirect("/")


@app.route('/searchSubCategory')
def search_subcategory():
    try:
        sub_category_dao = SubCategoryDao()
        data = sub_category_dao.search_subcategory()
    except Exception as ex:
        print("Category Insert Fail!!" + ex)
    return render_template("viewSubCategory.html", data=data)


@app.route('/deleteSubCategory')
def delete_subcategory():
    try:
        delete_id = request.args.get("id")
        sub_category_dao = SubCategoryDao()
        data = sub_category_dao.edit_sub_category(delete_id)
        sub_category_dao.delete_sub_category(data[0])
    except Exception as ex:
        print("Fail to search sub_category !!")
        print(ex)
    return redirect("/searchSubCategory")


@app.route('/editSubCategory')
def edit_subcategory():
    try:
        edit_id = request.args.get("id")
        sub_category_dao = SubCategoryDao()
        data = sub_category_dao.edit_sub_category(edit_id)
        category_dao = CategoryDao()
        cat = category_dao.search_category()
    except Exception as ex:
        print("Fail to edit sub_category!!")
        print(ex)
    return render_template("editSubCategory.html", data=data, cat=cat)


@app.route('/updateCategory', methods=["POST"])
def update_subcategory():
    try:
        category_id = request.form.get('categoryId')
        category_name = request.form.get('categoryName')
        category_description = request.form.get('categoryDes')
        category_vo = CategoryVo()
        category_dao = CategoryDao()
        category_vo.category_id = category_id
        category_vo.category_name = category_name
        category_vo.category_description = category_description
        category_dao.update_category(category_vo)
    except Exception as ex:
        print("Fail to update sub_category !!")
        print(ex)
    return redirect("/")
