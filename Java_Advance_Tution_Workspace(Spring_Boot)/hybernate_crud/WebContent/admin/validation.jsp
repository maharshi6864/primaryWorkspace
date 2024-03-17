<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>YoraUI Admin</title>
<!-- base:css -->
<link rel="stylesheet"
	href="adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet" href="adminResources/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="adminResources/css/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="adminResources/image/favicon.png" />
</head>

<body>
	<div class="container-scroller">
		<!-- partial:partials/_navbar.html -->


		<jsp:include page="header.jsp"></jsp:include>>


		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:partials/_sidebar.html -->


			<jsp:include page="menu.jsp"></jsp:include>


			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row grid-margin">
						<div class="col-12">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Bootstrap Maxlength</h4>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Default usage</label>
										</div>
										<div class="col-lg-8">
											<input class="form-control" maxlength="25"
												name="defaultconfig" id="defaultconfig" type="text"
												placeholder="Type Something..">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Few options</label>
										</div>
										<div class="col-lg-8">
											<input class="form-control" maxlength="20"
												name="defaultconfig-2" id="defaultconfig-2" type="text"
												placeholder="Type Something..">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">All the options</label>
										</div>
										<div class="col-lg-8">
											<input class="form-control" maxlength="10"
												name="defaultconfig-3" id="defaultconfig-3" type="text"
												placeholder="Type Something..">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Text Area</label>
										</div>
										<div class="col-lg-8">
											<textarea id="maxlength-textarea" class="form-control"
												maxlength="100" rows="2"
												placeholder="This textarea has a limit of 100 chars."></textarea>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row grid-margin">
						<div class="col-lg-12">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Basic form validation</h4>
									<form class="cmxform" id="commentForm" method="get" action="#">
										<fieldset>
											<div class="form-group">
												<label for="cname">Name (required, at least 2
													characters)</label> <input id="cname" class="form-control"
													name="name" minlength="2" type="text" required>
											</div>
											<div class="form-group">
												<label for="cemail">E-Mail (required)</label> <input
													id="cemail" class="form-control" type="email" name="email"
													required>
											</div>
											<div class="form-group">
												<label for="curl">URL (optional)</label> <input id="curl"
													class="form-control" type="url" name="url">
											</div>
											<div class="form-group">
												<label for="ccomment">Your comment (required)</label>
												<textarea id="ccomment" class="form-control" name="comment"
													required></textarea>
											</div>
											<input class="btn btn-primary" type="submit" value="Submit">
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
					<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
			<f:form action="insertSociety" method="post" modelAttribute="societyVo" cssStyle="margin: 0px;padding: 0px" >
				<!-- partial -->
				<div class="main-panel">
					<div class="content-wrapper">
						<div class="row grid-margin">
							<div class="col-12">
								<div class="card">
									<div class="card-body">
										<h4 class="card-title">Society Details</h4>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Society Name</label>
											</div>
											<div class="col-lg-8">
												<f:input path="id" type="hidden" />
												<f:input class="form-control" name="defaultconfig"
													id="defaultconfig" type="text"
													placeholder="Type Something.." path="societyName" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Society Address</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="20"
													name="defaultconfig-2" id="defaultconfig-2" type="text"
													placeholder="Type Something.." path="socityAddress" />
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Constructed By</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="10"
													name="defaultconfig-3" id="defaultconfig-3" type="text"
													placeholder="Type Something.." path="constructedBy"/>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">RERA Number</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="10"
													name="defaultconfig-3" id="defaultconfig-3" type="text"
													placeholder="Type Something.." path="RERANumber"/>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Contact Number</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="10"
													name="defaultconfig-3" id="defaultconfig-3" type="text"
													placeholder="Type Something.." path="contactNumber"/>
											</div>
										</div>
										<div class="form-group row">
											<div class="col-lg-3">
												<label class="col-form-label">Email Address</label>
											</div>
											<div class="col-lg-8">
												<f:input class="form-control" maxlength="10"
													name="defaultconfig-3" id="defaultconfig-3" type="text"
													placeholder="Type Something.." path="emailAddress"/>
											</div>
										</div>
										<input class="btn btn-primary" type="submit" value="Submit">
										<input class="btn btn-primary" type="submit" value="Edit">
									</div>
								</div>
							</div>
						</div>
					</div>
			</f:form>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->
				<footer class="footer">
					<div
						class="d-sm-flex justify-content-center justify-content-sm-between">
						<span
							class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright
							© 2018 <a href="https://www.urbanui.com/" target="_blank"
							class="text-muted">Urbanui</a>. All rights reserved.
						</span> <span
							class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted
							& made with <i class="mdi mdi-heart-outline text-primary"></i>
						</span>
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- base:js -->
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
	<script src="adminResources/js/jquery.validate.min.js"></script>
	<script src="adminResources/js/bootstrap-maxlength.min.js"></script>
	<!-- End plugin js for this page -->
	<!-- Custom js for this page-->
	<script src="adminResources/js/form-validation.js"></script>
	<script src="adminResources/js/bt-maxLength.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
