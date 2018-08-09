package com.company;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Operacje {

    public static List<Pacjent> listaPacjentow = new LinkedList<Pacjent>();
    public static List<Lekarz> listaLekarzy = new LinkedList<Lekarz>();
    public static List<DaneAdresowe> bazaAdresów = new LinkedList<DaneAdresowe>();

   public static void dodajAdres(String ulica, int nrDomu, int nrMieszkania) {

       bazaAdresów.add(new DaneAdresowe(ulica, nrDomu, nrMieszkania));

    }

}
