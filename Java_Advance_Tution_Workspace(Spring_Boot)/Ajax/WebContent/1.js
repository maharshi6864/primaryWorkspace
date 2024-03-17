
// Creating Global variable
var id = document.querySelector("#id1");
var firstname = document.querySelector("#firstname");
var lastname = document.querySelector("#lastname");
var username = document.querySelector("#username");
var password = document.querySelector("#password");
var flag = true;
var mytable
var table = document.querySelector("#data-table-body");
var example = document.querySelector("#example");


//Printing data from Api
function displayUser(data) {

  // table.innerHTML = "";
  // delete mytable;
  for (var index = 0; index < data.length; index++) {
    var newTR = table.insertRow(-1);
    newTR.insertCell(0).innerHTML = `<p>${1 + index
      }</p> <p style="display:none">${data[index].id}</p>`;
    newTR.insertCell(1).innerHTML = `${data[index].firstname}`;
    newTR.insertCell(2).innerHTML = `${data[index].lastname}`;
    newTR.insertCell(3).innerHTML = `${data[index].logiinVo.username}`;
    newTR.insertCell(4).innerHTML = `${data[index].logiinVo.password}`;
    newTR.insertCell(
      5
    ).innerHTML = `<button type="button" class="action-button"  onclick="deleteUser(this)" id="${data[index].id}"><i class="fa-solid fa-trash" style="color: red;"></i></button><button type="button" class="action-button" style="color:green;" id="${data[index].id}" onclick="editUser(this)"   data-bs-toggle="modal"
      data-bs-target="#exampleModal"><i class="fa-solid fa-pen-to-square"></i></button>`;
  }
  // if (flag) {
  mytable = new DataTable('#example');

  flag = false;
  // }

}

// function getUser() {
//   $(document).ready(function () {
//     $('#example').DataTable({
//       "processing": true,
//       "serverSide": true,
//       "lengthMenu": [[2, 4, 8, -1], [2, 4, 8, "All"]],
//       "ajax": {
//         url: "http://localhost:8082/search",
//         contentType: "application/json; charset=utf-8",
//         type: "GET"
//       },
//       "lengthChange": false,
//       "processing": true,
//       "serverSide ": true,
//       "pageLength": 10
//     });
//   });
//   // dumb()
// }

//Getting all the values from table row to the form
function editUser(user) {
  var row = user.parentNode.parentNode;
  id.value = row.cells[0].childNodes[2].innerHTML;
  console.log(row.cells[0].childNodes[2].innerHTML);
  firstname.value = row.cells[1].innerHTML;
  lastname.value = row.cells[2].innerHTML;
  username.value = row.cells[3].innerHTML;
  password.value = row.cells[4].innerHTML;
  console.log(id.value);
  document.querySelector("#model-button").innerHTML = "Save Changes";
  document.querySelector("#exampleModalLabel").innerHTML = "Alter User Details";

}

// Getting all the values from the register form
function getFormData() {

  var obj = {
    id: `${id.value}`,
    firstname: `${firstname.value}`,
    lastname: `${lastname.value}`,
    username: `${username.value}`,
    password: `${password.value}`,
  };
  id.value === "" ? addUser(obj) : updateUser(obj); // if id will be 0 then
  // addUser will be called
  // else updateUser will be
  // called
  emptyForm();
}

//Emptying values from the form
function emptyForm() {
  firstname.value = "";
  lastname.value = "";
  username.value = "";
  password.value = "";
  id.value = "";
  document.querySelector("#model-button").innerHTML = "Add user";
  document.querySelector("#exampleModalLabel").innerHTML = "Enter Registration Details";
}

//Adding new User 
function addUser(obj) {
  console.log("adding new a user");
  var htp = new XMLHttpRequest();
  htp.open("POST", "http://localhost:8082/user", true);
  htp.setRequestHeader("Content-Type", "application/json");
  htp.onreadystatechange = function () {
    if (htp.readyState == 4) {
      getUser();
    }
  };
  htp.send(JSON.stringify(obj));
}

//Updating the Old user
function updateUser(obj) {
  console.log(id.value);
  console.log("adding new an old user");
  var htp = new XMLHttpRequest();
  htp.open("PUT", "http://localhost:8082/update", true);
  htp.setRequestHeader("Content-Type", "application/json");
  htp.onreadystatechange = function () {
    //    console.log(htp.readyState);
    if (htp.readyState == 4) {
      //      console.log("okay");
      getUser();
    }
  };
  htp.send(JSON.stringify(obj));
}

//Deleting the Old User
function deleteUser(user) {
  var row = user.parentNode.parentNode;
  id = row.cells[0].childNodes[2].innerHTML;
  var htp = new XMLHttpRequest();
  let url = `http://localhost:8082/delete/${id}`
  htp.open("DELETE", url, true);
  htp.onreadystatechange = function () {
    //    console.log(htp.readyState);
    if (htp.readyState == 4) {
      console.log("delete done");
      // table.innerHTML = ""
      // getUser();
      console.log(user.rowIndex)
      // document.querySelector("#data-table-body").innerHTML = "";
      table.deleteRow(user.rowIndex)
    }
  };
  htp.send();
}

//Searching all users 
function getUser() {
  var htp = new XMLHttpRequest();
  htp.onreadystatechange = function () {
    console.log(htp.readyState);

    if (htp.readyState == 4) {
      var obj = JSON.parse(htp.responseText);

      var responseBody = obj.body;

      if (responseBody.status) {
        let data = responseBody.data;
        document.querySelector("#data-table-body").innerHTML = "";
        displayUser(data);
      }
    }
  };

  htp.open("GET", "http://localhost:8082/search", true);
  htp.send();
}