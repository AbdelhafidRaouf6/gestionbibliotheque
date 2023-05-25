<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Liste des livres</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <header>
        <div class="container">
             <div class="row">
                 <div class="col-md-6">
                     <h1>Créer un livre</h1>
                 </div><br><br>
    </header>
    <main>
        <div class="container">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Livre Id</th>
                        <th width = "100px">Titres Livres</th>
                        <th>Auteur Livres</th>
                        <th>Genre Livres</th>
                        <th>Date de Creation</th>
                        <th>Résumé</th>
                        <th>Prix</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${livresJsp}" var="livre">
                        <tr>
                            <td>${livre.id}</td>
                            <td>${livre.titre}</td>
                            <td>${livre.auteur.nom} ${livre.auteur.prenom}</td>
                            <td>${livre.genre.nom}</td>
                            <td><fmt:formatDate pattern="dd/MM/yyyy" value="${livre.dateCreation}" /></td>
                            <td>${livre.resume}</td>
                            <td>${livre.prix} USD</td>

                            <td width="100px">
                                <div style="display:flex;">
                                <a onClick="return confirm('Are you sure to delete this item ?')"
                                   href="deletelivre?id=${livre.id}" class="btn btn-danger">Delete</a>&nbsp;&nbsp;
                                   <a href="showLivre?id=${livre.id}" class="btn btn-primary">Edit</a>&nbsp;&nbsp;

                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </main>
    <footer>
        <div class="container">
            <a href="createlivres" class="btn btn-success">Ajouter Livre</a>
        </div>
    </footer>

    <!-- Include Bootstrap JS (Optional, if you need to use Bootstrap JavaScript components) -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
