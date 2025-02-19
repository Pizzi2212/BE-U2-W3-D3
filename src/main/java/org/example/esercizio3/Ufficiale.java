package org.example.esercizio3;

public abstract class Ufficiale {

    protected Ufficiale superiore;
    protected int stipendio;

    public void setSuperiore(Ufficiale superiore) {
        this.superiore = superiore;
    }

    public void verificaStipendio(int importo) {
        if (stipendio >= importo) {
            System.out.println(this.getClass().getSimpleName() + " percepisce almeno " + importo + "€");
        } else if (superiore != null) {
            superiore.verificaStipendio(importo);
        } else {
            System.out.println("Nessun ufficiale percepisce almeno " + importo + "€");
        }
    }
}

