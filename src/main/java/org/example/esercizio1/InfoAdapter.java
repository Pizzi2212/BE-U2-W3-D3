package org.example.esercizio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class InfoAdapter implements DataSource {

    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }
   @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

   @Override
    public int getEta() {
        return Period.between(info.getDataDiNascita().toInstant()
                .atZone(ZoneId.systemDefault()).toLocalDate(), LocalDate.now()).getYears();
    }
}
