package com.bibliotheque.gestionbibliotheque.controllers;

import com.bibliotheque.gestionbibliotheque.entities.Auteur;
import com.bibliotheque.gestionbibliotheque.entities.Genre;
import com.bibliotheque.gestionbibliotheque.entities.Livre;
import com.bibliotheque.gestionbibliotheque.services.AuteurServices.AuteurServices;
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
public class AuteurController {
    @Autowired
    AuteurServices auteurServices;

    @RequestMapping("/createauteur")
    public String createAuteur(ModelMap modelMap){
        return "CreateAuteur";
    }
    @RequestMapping(value = "/saveAuteur", method = RequestMethod.POST)
    public String saveAuteur(@ModelAttribute("auteur") Auteur auteur,
                            @RequestParam("dateJsp") String dateController,
                            ModelMap modelMap
    ) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateNaissance = dateFormat.parse(String.valueOf(dateController));
        auteur.setDateNaissance(dateNaissance);
        auteurServices.createAuteur(auteur);
        return "CreateAuteur";
    }
    @RequestMapping("/auteurlistes")
    public String auteurlistes(ModelMap modelMap){
        List<Auteur> auteurController = auteurServices.getAllAuteur();
        modelMap.addAttribute("auteursJsp", auteurController);
        return "AuteursListe";
    }
    @RequestMapping("/deleteauteur")
    public String deleteLivre(@RequestParam("id") Long id, Model modelMap){
        auteurServices.deleteAuteur(id);
        List<Auteur> auteurController = auteurServices.getAllAuteur();
        modelMap.addAttribute("livresJsp", auteurController);
        return "AuteursListe";
    }
    @RequestMapping("/showAuteur")
    public String showAuteur(@RequestParam("id") Long id, ModelMap modelMap){
        Auteur auteurController = auteurServices.getAuteurById(id);
        modelMap.addAttribute("auteurJsp",auteurController);
        return "EditAuteur";
    }
    @RequestMapping(value = "/updateAuteur")
    public String updateAuteur(@ModelAttribute("livre") Auteur auteur,
                              ModelMap modelMap){
        Auteur memo = auteurServices.createAuteur(auteur);
        String messageController = "The livre whode Id : " + memo.getId() + "is saved";
        modelMap.addAttribute("messageJsp", messageController);
        return "CreateAuteur";
    }

}
