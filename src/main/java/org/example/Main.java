package org.example;

import org.example.esercizio3.*;

public class Main {
    public static void main(String[] args) {
        // Setup della gerarchia
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();

        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        // Test verifica stipendio
        tenente.verificaStipendio(250);
    }
}