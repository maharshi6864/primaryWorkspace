import flask
from flask import Flask, render_template, request,flash

app = Flask(__name__)
app.secret_key = "My supppppperrrr key"

error = True


@app.route('/')
def register():  # put application's code here
    return render_template('register.html')


@app.route('/login', methods=["POST"])
def login():
    flask.session.setdefault("firstname", request.form.get("firstname"))
    flask.session.setdefault("lastname", request.form.get("lastname"))
    flask.session.setdefault("username", request.form.get("username"))
    flask.session.setdefault("password", request.form.get("password"))
    flash("Invalid Username")
    if error:
        return (f'<form action="check" method="post">'
                f'<input type="text" name="username" placeholder="Enter Username" />'
                f'<br /><br />'
                f'<input type="text" name="password" placeholder="Enter Password" />'
                f'<br /><br />'
                f'<button type="submit">Login</button>'
                f'</form>')
    else:
        error = True
        return (f'<form action="check" method="post">'
                f'<input type="text" name="username" placeholder="Enter Username" />'
                f'<br /><br />'
                f'<input type="text" name="password" placeholder="Enter Password" />'
                f'<br /><br />'
                f'Wrong  Username or Password'
                f'<button type="submit">Login</button>'
                f'</form>'
                )


@app.route('/check', methods=["POST"])
def check():
    username_login = request.form.get("username")
    password_login = request.form.get("password")
    username_sess = flask.session.get("username")
    password_sess = flask.session.get("password")
    if username_sess == username_login and password_sess == password_login:
        return f'Welcome {flask.session.get("firstname")}{flask.session.get("lastname")}'
    else:
        global error
        error = False
        return login()


if __name__ == '__main__':
    app.run(debug=True)
