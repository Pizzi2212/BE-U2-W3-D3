package org.example.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Libro{
    private List<ElementoLibro> contenuti = new ArrayList<>();
    private List<String> autori;
    private double prezzo;

    public Libro(List<String> autori, double prezzo) {
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        contenuti.add(elemento);
    }

    public int getNumeroTotalePagine() {
        return contenuti.stream().mapToInt(ElementoLibro::getNumeroPagine).sum();
    }

    public void stampa() {
        System.out.println("Stampa intero libro...");
        for (ElementoLibro elemento : contenuti) {
            elemento.stampa();
        }
    }
}

