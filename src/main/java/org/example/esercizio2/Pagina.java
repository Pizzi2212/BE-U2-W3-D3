package org.example.esercizio2;

public class Pagina implements ElementoLibro {

    private int numero;
    public Pagina(int numero) {
        this.numero = numero;
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa pagina " + numero);
    }
}
