var categoryId = document.getElementById("category");
var subCategoryId = document.getElementById("subcategory");
function getSubCategory() {
  subCategoryId.innerHTML = "";
  console.log(categoryId.value);
  var htp = new XMLHttpRequest();
  htp.onreadystatechange = function () {
    //    console.log(htp.readyState);
    if (htp.readyState == 4) {
      console.log(htp.responseText)
      var obj = JSON.parse(htp.responseText);
      console.log(obj)
      for (let i = 0; i < obj.length; i++) {
        var option = document.createElement("option");
        option.value = obj[i].sub_category_id;
        option.text = obj[i].sub_category_name;
        subCategoryId.options.add(option);
      }
      console.log(obj);
    }
  };
  htp.open("GET", `getSubCategories?id=${categoryId.value}`, true);
  htp.send();
}