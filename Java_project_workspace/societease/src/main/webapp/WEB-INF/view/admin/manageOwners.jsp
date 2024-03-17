<%@ page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8"/>
    <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <title>Admin | Owner Details</title>
    <!-- base:css -->
    <link
            rel="stylesheet"
            href="adminResources/css/materialdesignicons.min.css"
    />
    <link rel="stylesheet" href="adminResources/css/vendor.bundle.base.css"/>
    <!-- endinject -->
    <!-- plugin css for this page -->
    <link
            rel="stylesheet"
            href="adminResources/css/dataTables.bootstrap4.css"
    />
    <!-- End plugin css for this page -->
    <!-- inject:css -->
    <link rel="stylesheet" href="adminResources/css/style.css"/>
    <!-- endinject -->
    <link rel="shortcut icon" href="adminResources/image/favicon.png"/>
</head>

<body>
<div class="container-scroller">
    <!-- partial:partials/_navbar.html -->

    <jsp:include page="header.jsp"/>

    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_sidebar.html -->

        <jsp:include page="menu.jsp"/>

        <%-- <%@taglib prefix="f" uri="http://www.springframework.org/tags/form"
        %>--%>
        <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

        <!-- Modal starts -->

        <div
                class="modal fade"
                id="exampleModal-3"
                tabindex="-1"
                role="dialog"
                aria-labelledby="ModalLabel"
                aria-hidden="true"
        >
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="ModalLabel">Add Owners</h5>
                        <button
                                type="button"
                                class="close"
                                data-dismiss="modal"
                                aria-label="Close"
                                onclick="emptyForm()"
                        >
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="ownerName" method="post" class="model-form">
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <label class="col-form-label"
                                    >Block Name :
                                    </label>
                                    <select
                                            class="form-control"
                                            name="blockId"
                                            onchange="blockChange(this)"
                                    >
                                        <option value="" disabled selected>
                                            Select Block Name
                                        </option>
                                        <c:forEach items="${blockList}" var="i" varStatus="">
                                            <c:if test="${i.status}">
                                                <option value="${i.id}">${i.blockName}</option>
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-7">
                                    <label for="number-of-floors" class="col-form-label"
                                    >Floor:
                                    </label>
                                </div>
                                <div class="col-lg-5">
                                    <label for="number-of-floors" class="col-form-label"
                                    >Number Of House:
                                    </label>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-lg-7">
                                    <select
                                            class="form-control"
                                            id="number-of-floors"
                                            name="floorNumber"
                                            onchange="floorChange(this)"
                                    >
                                        <option value="">- -</option>
                                    </select>
                                </div>
                                <div class="col-lg-5">
                                    <input
                                            type="text"
                                            name=""
                                            value="- -"
                                            class="form-control"
                                            id="number-of-house"
                                            disabled
                                    />
                                </div>
                            </div>
                            <div class="row" id="house-numbers-label"></div>
                            <div class="row">
                                <div class="col-lg-12" id="house-numbers-ownwers"></div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button
                                    class="btn btn-primary"
                                    type="submit"
                                    value="Submit"
                                    id="submit"
                            >
                                Submit
                            </button>
                            <button
                                    type="button"
                                    class="btn btn-light"
                                    data-dismiss="modal"
                                    onclick="emptyForm()"
                            >
                                Close
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <!-- Modal Ends -->

        <!-- partial -->

        <div class="main-panel">
            <div class="content-wrapper">
                <h3 class="main-title">Owner Details</h3>
                <div
                        class="d-flex justify-content-between align-content-center"
                        style="margin-bottom: 20px"
                >
                    <nav
                            aria-label="breadcrumb d-flex align-content-center"
                            class="bread"
                    >
                        <ol class="breadcrumb border-0 p-0 d-flex align-content-center">
                            <li class="breadcrumb-item"><a href="index">Dashboard</a></li>
                            <li class="breadcrumb-item active" aria-current="page">
                                Manage Owners
                            </li>
                        </ol>
                    </nav>
                    <button
                            type="button"
                            class="btn btn-primary btn-sm"
                            data-toggle="modal"
                            data-target="#exampleModal-3"
                    >
                        Add Owners
                    </button>
                </div>
                <div class="row ">
                    <div class="col-lg-3">
                        <label for="blockSearch" class="col-form-label"
                        >Block Name:
                        </label>
                    </div>
                    <div class="col-lg-3">
                        <label for="number-of-floors-search" class="col-form-label"
                        >Floor No:
                        </label>
                    </div>
                </div>
                <div class="row  mb-2">
                    <div class="col-lg-3">
                        <select
                                class="form-control"
                                name="blockId"
                                id="blockSearch"
                                onchange="blockChangeForTable(this)"
                        >
                            <option value="" disabled selected>Select Block Name</option>
                            <c:forEach items="${blockList}" var="i" varStatus="">
                                <c:if test="${i.status}">
                                    <option value="${i.id}">${i.blockName}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="col-lg-3">
                        <select
                                class="form-control"
                                id="number-of-floors-search"
                                name="floorNumber"
                                onchange="bringOwners(this)"
                        >
                            <option value="">- -</option>
                        </select>
                    </div>
                </div>
                <div class="card">
                    <div class="card-body">
                        <div class="row">
                            <div class="col-12">
                                <div class="table-responsive">
                                    <table class="table table-bordered">
                                        <thead>
                                        <tr>
                                            <th>Sr.No</th>
                                            <th>House Number</th>
                                            <th>Owner Name</th>
                                        </tr>
                                        </thead>
                                        <tbody id="owner-table">
                                        <tr>
                                            <td colspan="3" style="text-align: center; padding: 50px">- -</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- content-wrapper ends -->
            <!-- partial:../../partials/_footer.html -->

            <jsp:include page="footer.jsp"></jsp:include>

            <!-- partial -->
        </div>
        <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<!-- container-scroller -->
<!-- base:js -->
<script src="adminResources/js/manageBlock.js"></script>
<script src="adminResources/js/manageOwner.js"></script>
<script src="adminResources/js/vendor.bundle.base.js"></script>
<!-- endinject -->
<!-- inject:js -->
<script src="adminResources/js/off-canvas.js"></script>
<script src="adminResources/js/hoverable-collapse.js"></script>
<script src="adminResources/js/template.js"></script>
<script src="adminResources/js/settings.js"></script>
<script src="adminResources/js/todolist.js"></script>
<!-- endinject -->
<!-- plugin js for this page -->
<script src="adminResources/js/jquery.dataTables.js"></script>
<script src="adminResources/js/dataTables.bootstrap4.js"></script>
<!-- End plugin js for this page -->
<!-- Custom js for this page-->
<script src="adminResources/js/data-table.js"></script>
<!-- End custom js for this page-->
</body>
</html>
