<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste des auteurs</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Liste des auteurs</h1>

        <table class="table">
            <thead class="thead-dark">
                <tr>
                    <th>ID</th>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>Date de naissance</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${auteursJsp}" var="auteur">
                    <tr>
                        <td>${auteur.id}</td>
                        <td>${auteur.nom}</td>
                        <td>${auteur.prenom}</td>
                        <td><fmt:formatDate pattern="dd/MM/yyyy" value="${auteur.dateNaissance}" /></td>
                        <td>
                            <a onclick="return confirm('Are you sure to delete this item?')"
                                href="deleteauteur?id=${auteur.id}" class="btn btn-danger">Delete</a>
                            <a href="showAuteur?id=${auteur.id}" class="btn btn-primary">Edit</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
