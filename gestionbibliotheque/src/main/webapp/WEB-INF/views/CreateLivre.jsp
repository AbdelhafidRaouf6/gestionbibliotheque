<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Créer un livre</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Créer un livre</h1>
        <form action="saveLivre" method="POST">
            <div class="form-group">
                <label for="titre">Titre:</label>
                <input type="text" id="titre" name="titre" class="form-control"required>
            </div>


            <div class="form-group">
                <label for="auteur">Auteur:</label>
                <select name="auteur" class="form-control" required>
                    <option value="">Sélectionner un auteur</option>
                    <c:forEach var="auteur" items="${auteurs}">
                        <option value="${auteur.id}">${auteur.prenom} ${auteur.nom}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="genre">Genre:</label>
                <select name="idGenre" class="form-control" required>
                    <option value="">Sélectionner un genre</option>
                    <c:forEach var="genre" items="${genres}">
                        <option value="${genre.id}">${genre.nom}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="form-group">
                <label for="dateCreation">Date de Création:</label>
                <input type="date" placeholder="yyyy-MM-dd" name="dateJsp" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="resume">Résumé:</label>
                <textarea id="resume" name="resume" class="form-control"  required></textarea>
            </div>

            <div class="form-group">
                <label for="prix">Prix:</label>
                <input type="number" id="prix" name="prix" class="form-control" required>
            </div>

            <button type="submit" class="btn btn-success">Créer Livre</button>
        </form>
    </div>

    <!-- Include Bootstrap JS (Optional, if you need to use Bootstrap JavaScript components) -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
