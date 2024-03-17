from base import app
from flask import render_template, request, redirect
from base.com.vo.category_vo import CategoryVo
from base.com.dao.category_dao import CategoryDao


@app.route('/')
def home():  # put application's code here
    return render_template("home.html")


@app.route('/addCategory')
def addCategory():  # put application's code here
    return render_template("addCategory.html")


@app.route('/insertCategory', methods=["POST"])
def insert_category():
    try:
        category_name = request.form.get('categoryName')
        category_description = request.form.get('categoryDes')
        category_vo = CategoryVo()
        category_dao = CategoryDao()
        category_vo.category_name = category_name
        category_vo.category_description = category_description
        category_dao.insert_category(category_vo)
    except Exception as ex:
        print("Fail to insert category!!")
        print(ex)
    return redirect("/")


@app.route('/searchCategory')
def search_category():
    try:
        category_dao = CategoryDao()
        data = category_dao.search_category()
        print(data)
    except Exception as ex:
        print("Fail to search category!!")
        print(ex)
    return render_template("viewCategory.html", data=data)


@app.route('/delete')
def delete_user():
    try:
        delete_id = request.args.get("id")
        category_dao = CategoryDao()
        data = category_dao.edit_category(delete_id)
        category_dao.delete_category(data[0])
    except Exception as ex:
        print("Fail to delete category!!")
        print(ex)
    return redirect("/")


@app.route('/edit')
def edit_user():
    try:
        edit_id = request.args.get("id")
        print(edit_id)
        category_dao = CategoryDao()
        data = category_dao.edit_category(edit_id)
    except Exception as ex:
        print("Fail to edit category!!")
        print(ex)
    return render_template("editCategory.html", data=data)


@app.route('/updateCategory', methods=["POST"])
def update_category():
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
        print("Fail to update category!!" )
        print(ex)
    return redirect("/")
