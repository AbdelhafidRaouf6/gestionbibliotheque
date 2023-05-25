<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Créer un Auteur</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h1>Créer un Auteur</h1>
        <form action="saveAuteur" method="POST">
            <div class="form-group">
                <label for="nom">Nom:</label>
                <input type="text" class="form-control" id="nom" name="nom" required>
            </div>

            <div class="form-group">
                <label for="prenom">Prenom:</label>
                <textarea class="form-control" id="prenom" name="prenom" required></textarea>
            </div>

            <div class="form-group">
                <label for="dateNaissance">Date de Naissance:</label>
                <input type="date" class="form-control" placeholder="yyyy-MM-dd" name="dateJsp" required>
            </div>

            <button type="submit" class="btn btn-primary">Créer</button>
        </form>
    </div>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
