import flask
from flask import Flask, render_template, request, redirect

app = Flask(__name__)


@app.route('/result', methods=["POST"])
def register_response():  # put application's code here
    firstname = request.form.get("fn")
    lastname = request.form.get("ln")
    username = request.form.get("user")
    password = request.form.get("pass")
    gender = request.form.get("gen")
    hob = request.form.getlist("hob")
    print(type(gender))
    hobbies = ",".join(hob)
    return (f'Firstname :{firstname} <br>'
            f'Lastname :{lastname}<br>'
            f'Username :{username} <br>'
            f'Password :{password}<br>'
            f'Gender :{gender} <br>'
            f'Hobbies:{hobbies}'
            )

@app.route('/')
def register():  # put application's code here
    return render_template("form.html")


if __name__ == '__main__':
    app.run(port=8808, debug=True)
