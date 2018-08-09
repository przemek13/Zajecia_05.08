package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pacjent {

    String imiePacjenta;
    String nazwiskoPacjenta;
    DaneAdresowe daneAdresowe;

    Scanner sc = new Scanner(System.in);

    @Override
    public String toString() {
        return "Pacjent{" +
                "imiePacjenta='" + imiePacjenta + '\'' +
                ", nazwiskoPacjenta='" + nazwiskoPacjenta + '\'' +
                ", daneAdresowe=" + daneAdresowe +
                '}';
    }

    List <Pacjent> listaPacjentów = new ArrayList<Pacjent>();

    Pacjent (String imiePacjenta, String nazwiskoPacjenta, DaneAdresowe daneAdresowe) {

        this.imiePacjenta = imiePacjenta;
        this.nazwiskoPacjenta = nazwiskoPacjenta;
        this.daneAdresowe = daneAdresowe;

    }

    void dodajPacjenta () {
        System.out.println("Podaj imię pacjenta: ");
        String imiePacjenta = sc.nextLine();
        System.out.println("Podaj nazwisko pacjenta: ");
        String nazwiskoPacjenta = sc.nextLine();
        System.out.println("Podaj nazwę ulicy: ");

    }

}
