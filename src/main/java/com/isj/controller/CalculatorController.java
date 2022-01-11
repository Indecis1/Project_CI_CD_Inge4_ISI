package com.isj.controller;


import org.springframework.web.bind.annotation.*;
import utils.Resultat;

@RestController
public class CalculatorController {

    @GetMapping(path = "")
    public String home(){
        String choix = "Voici les chemins accessibles: \n1- addition/x/y \n2- soustraction/x/y \n3- division/x/y ; Nous implémenterons bientôt le modulo et la multiplication";
        return choix;
    }

    @GetMapping(path = "addition/{x}/{y}")
    public Resultat addWithGet(@PathVariable double x, @PathVariable double y){
        Resultat result = new Resultat();
        result.setResult(x + y);
        return result;
    }

    @GetMapping(path = "multiplication/{x}/{y}")
    public Resultat multiplicationWithGet(@PathVariable double x, @PathVariable double y){
        Resultat result = new Resultat();
        result.setResult(x * y);
        return result;
    }

    /*
    //Fonction de soustraction faite par Marvin BIDZANA
    @GetMapping(path = "soustraction/{x}/{y}")
    public Resultat removeWithGet(@PathVariable double x, @PathVariable double y){
        Resultat result = new Resultat();
        result.setResult(x - y);
        return result;
    }*/

    //Fonction soustraction : MFATCHOUA NDAMKOU Carmella ;

    @GetMapping(path = "division/{x}/{y}")
    public Resultat divisionWithGet(@PathVariable double x, @PathVariable double y){
        Resultat result = new Resultat();
        result.setResult(x / y);
        return result;
    }
    /*
    @GetMapping(path = "modulo/{x}/{y}")
    public Resultat moduloWithGet(@PathVariable double x, @PathVariable double y){
        Resultat result = new Resultat();
        result.setResult(x % y);
        return result;
    }
    */

}
