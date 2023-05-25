<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <title>Product Creation</title>
</head>
<body>
    <div class="container">
    <header>
        <h1>Product Edition</h1>
    </header>
    <main>
        <form action="updateLivre" method="post">
            <div class="form-group">
                <label for="idLivre">Product Id:</label>
                <input type="text" class="form-control" id="idLivre" name="idLivre" value="${livreJsp.id}">
            </div>
            <div class="form-group">
                <label for="titre">Titre:</label>
                <input type="text" class="form-control" id="titre" name="titre" required value="${livreJsp.titre}">
            </div>
            <div class="form-group">
                <label for="auteur">Auteur:</label>
                <select class="form-control" name="idAuteur" required>
                    <option value="">Sélectionner un auteur</option>
                    <c:forEach var="auteur" items="${auteurs}">
                        <option value="${auteur.prenom}${auteur.nom}">${auteur.prenom} ${auteur.nom}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="genre">Genre:</label>
                <select class="form-control" name="idGenre" required>
                    <option value="">Sélectionner un genre</option>
                    <c:forEach var="genre" items="${genres}">
                        <option value="${genre.nom}">${genre.nom}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label for="resume">Resume:</label>
                <input type="text" class="form-control" id="resume" name="resume" value="${livreJsp.resume}">
            </div>
            <div class="form-group">
                <label for="prix">Prix:</label>
                <input type="text" class="form-control" id="prix" name="prix" value="${livreJsp.prix}">
            </div>
            <div class="form-group">
                <input type="submit" class="btn btn-success" value="Update">
            </div>
        </form>
    </main>
    <footer class="footer">
        <a href="livrelistes" class="btn btn-warning">Livre List</a>
    </footer>


    <!-- Include Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
