package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Wizyty {

    Date data;
    Lekarz lekarz;
    Pacjent pacjent;

    Wizyty(Date data, Lekarz lekarz, Pacjent pacjent) {

        this.data = data;
        this.lekarz = lekarz;
        this.pacjent = pacjent;

    }

}
