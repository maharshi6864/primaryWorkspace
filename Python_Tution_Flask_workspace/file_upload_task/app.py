import pymysql
from flask import Flask, request, render_template, redirect


def convertToBinaryData(filename):
    # Convert digital data to binary format
    with open(filename, 'rb') as file:
        binaryData = file.read()
    return binaryData


def con():
    connection = pymysql.connect(
        host="localhost",
        user="root",
        password="root",
        port=3307,
        db="flask_db",
        cursorclass=pymysql.cursors.DictCursor
    )
    return connection


app = Flask(__name__)


@app.route('/')
def hello_world():  # put application's code here
    return render_template("uploadimage.html")


@app.route("/uploadImage", methods=["POST"])
def Insert_reg():
    img = request.files['image']
    image_name = request.form.get("imageName")
    image = img.read()
    connection = con()
    cursor1 = connection.cursor()
    sql_insert_blob_query = """ INSERT INTO files_task(image_name,image) values(%s,%s)"""
    insert_blob_tuple = (image_name, image)
    cursor1.execute(sql_insert_blob_query, insert_blob_tuple)
    connection.commit()
    cursor1.close()
    connection.close()
    return redirect("/")


if __name__ == '__main__':
    app.run(debug=True)
