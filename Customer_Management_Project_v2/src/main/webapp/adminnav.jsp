<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AdminNav</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-warning">
  <div class="container-fluid" >
    <a class="navbar-brand text-dark" href="addCustomer.jsp" target="blank_">InsertCustomer</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active text-dark" aria-current="page" href="updateCustomer.jsp" target="blank_">UpdateCustomer</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark" href="deleteCustomer.jsp" target="blank_">DeleteCustomer</a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-dark" href="adminLogout">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

</body>
</html>