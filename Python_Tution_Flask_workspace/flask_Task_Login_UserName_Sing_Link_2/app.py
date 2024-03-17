import flask
from flask import Flask, render_template, request, sessions

app = Flask(__name__)
app.secret_key = "super secret keysss"

username = ""
password = ""


@app.route('/')
def hello_world():  # put application's code here
    return render_template('login.html')


@app.route('/link_page', methods=["POST"])
def link_page():  # put application's code here
    username = request.form.get('username')
    password = request.form.get('password')
    flask.session.setdefault("username", username)
    flask.session.setdefault("password", password)
    return (f'<a href="http://127.0.0.1:5000/username">Get UserName</a>'
            f'<br> <br>'
            f'{username}<br><br>'
            f'{password}<br><br>')


@app.route('/username')
def username():  # put application's code here
    username = flask.session.get("username")
    password = flask.session.get("password")
    return (f'{username}<br><br>'
            f'{password}')


if __name__ == '__main__':
    app.run(debug=True)
