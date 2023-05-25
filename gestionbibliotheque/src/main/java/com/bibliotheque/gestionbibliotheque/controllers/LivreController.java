package com.bibliotheque.gestionbibliotheque.controllers;

import com.bibliotheque.gestionbibliotheque.entities.Auteur;
import com.bibliotheque.gestionbibliotheque.entities.Genre;
import com.bibliotheque.gestionbibliotheque.entities.Livre;
import com.bibliotheque.gestionbibliotheque.services.AuteurServices.AuteurServices;
import com.bibliotheque.gestionbibliotheque.services.GenreServices.GenreService;
import com.bibliotheque.gestionbibliotheque.services.LivreServices.LivreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class LivreController {
    @Autowired
    LivreServices livreServices;
    @Autowired
    GenreService genreService;
    @Autowired
    AuteurServices auteurServices;
    @RequestMapping("/createlivres")
    public String createLivre(ModelMap modelMap){
        List<Genre> genres = genreService.getAllGenres();
        List<Auteur> auteurs = auteurServices.getAllAuteur();
        modelMap.addAttribute("auteurs",auteurs);
        modelMap.addAttribute("genres", genres);
        return "CreateLivre";
    }
    @RequestMapping(value = "/saveLivre", method = RequestMethod.POST)
    public String savelivre(@ModelAttribute("livre") Livre livre,
                            @RequestParam("dateJsp") String dateController,
                            ModelMap modelMap
                            ) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateCreation = dateFormat.parse(String.valueOf(dateController));
        livre.setDateCreation(dateCreation);
        livreServices.createLivre(livre);
        return "CreateLivre";
    }
    @RequestMapping("/livrelistes")
    public String livreListe(ModelMap modelMap){
        List<Livre> livreController = livreServices.getAllLivres();
        modelMap.addAttribute("livresJsp", livreController);
        return "LivresListe";
    }
    @RequestMapping("/deletelivre")
    public String deleteLivre(@RequestParam("id") Long id, Model modelMap){
        livreServices.deleteLivre(id);
        List<Livre> livreController = livreServices.getAllLivres();
        modelMap.addAttribute("livresJsp", livreController);
        return "LivresListe";
    }
    @RequestMapping("/showLivre")
    public String showLivre(@RequestParam("id") Long id, ModelMap modelMap){
        Livre livreController = livreServices.getLivreById(id);
        modelMap.addAttribute("livreJsp", livreController);
        List<Genre> genres = genreService.getAllGenres();
        List<Auteur> auteurs = auteurServices.getAllAuteur();
        modelMap.addAttribute("auteurs",auteurs);
        modelMap.addAttribute("genres", genres);
        return "EditLivre";
    }
    @RequestMapping(value = "/updateLivre")
    public String updateLivre(@ModelAttribute("livre") Livre livre,
                              ModelMap modelMap){
        Livre memo = livreServices.createLivre(livre);
        String messageController = "The livre whode Id : " + memo.getid() + "is saved";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateLivre";
    }


    }



