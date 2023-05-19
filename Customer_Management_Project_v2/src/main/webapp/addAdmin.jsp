<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InsertAdmin</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="ownernav.jsp"></jsp:include>
	<div>
		<section class="vh-100" style="background-color: #eee;">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-lg-12 col-xl-11">
						<div class="card text-black" style="border-radius: 25px;">
							<div class="card-body p-md-5">
								<div class="row justify-content-center">
									<div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">

										<p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">InsertAdmin
										</p>

										<form class="mx-1 mx-md-4" action="insertAdmin" method="post">

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-user fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<label class="form-label" for="form3Example1c">adminId
													</label> <input type="number" name="adminId" id="form3Example1c"
														class="form-control" />

												</div>
											</div>

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<label class="form-label" for="form3Example3c">adminName</label>
													<input type="text" name="adminName" id="form3Example3c"
														class="form-control" />
												</div>
											</div>

											<div class="d-flex flex-row align-items-center mb-4">
												<i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
												<div class="form-outline flex-fill mb-0">
													<label class="form-label" for="form3Example3c">adminEmail</label>
													<input type="email" name="adminEmail" id="form3Example3c"
														class="form-control" />
												</div>
											</div>
											
											<div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
												<input type="submit" value="insert">&nbsp;&nbsp;&nbsp;&nbsp;
												<input type="reset" value="reset">
											</div>
										</form>
									</div>
									<div
										class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

										<img
											src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
											class="img-fluid" alt="Sample image">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</section>
	</div>
</body>
</html>