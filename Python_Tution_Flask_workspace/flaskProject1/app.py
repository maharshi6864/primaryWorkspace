from flask import Flask, render_template, request

app = Flask(__name__)

savedUsername = "maharshi6868"
savedPassword = "maharshi"


@app.route('/check',methods=["POST"])
def check():
    username = request.form.get("user")
    password = request.form.get("pass")
    if username == savedUsername and savedPassword == password:
        return f"Welcome {username}"
    else:
        return f"Invalid Password"


@app.route('/')
def hello_world():  # put application's code here
    return render_template("login.html")


if __name__ == '__main__':
    app.run(debug=True)
