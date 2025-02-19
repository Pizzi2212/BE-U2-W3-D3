package org.example.esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {

    private List<ElementoLibro> elementi = new ArrayList<>();

    public void aggiungiElemento(ElementoLibro elemento) {
        elementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        return elementi.stream().mapToInt(ElementoLibro::getNumeroPagine).sum();
    }

    @Override
    public void stampa() {
        System.out.println("Stampa sezione...");
        for (ElementoLibro elemento : elementi) {
            elemento.stampa();
        }
    }
}
