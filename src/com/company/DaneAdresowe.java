package com.company;

import java.util.Scanner;

public class DaneAdresowe {

    private String ulica;
    private int nrDomu;
    private int nrMieszkania;

    @Override
    public String toString() {
        return "DaneAdresowe{" +
                "ulica='" + ulica + '\'' +
                ", nrDomu=" + nrDomu +
                ", nrMieszkania=" + nrMieszkania +
                '}';
    }

    DaneAdresowe (String ulica, int nrDomu, int nrMieszkania) {

        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;

    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(int nrDomu) {
        this.nrDomu = nrDomu;
    }

    public int getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(int nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }
}
