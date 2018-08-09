package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Queue<Integer> kolejka = new LinkedList<Integer>();

        Random generator = new Random();

        for (int i = 0; i < 20; i++) {

            kolejka.add(generator.nextInt(100));
        }

        for (Integer a : kolejka) {
            System.out.println(a);
        }

        System.out.println();

        System.out.println(kolejka.size());

        System.out.println();

        System.out.println(kolejka.peek());

        System.out.println();

        System.out.println(kolejka.remove());

        System.out.println();

        System.out.println(kolejka.peek());

        System.out.println();

        while (!kolejka.isEmpty()) {

            System.out.println(kolejka.poll());

        }

        System.out.println();

        System.out.println(kolejka.size());*/

        Queue<Wizyty> rejestracja = new LinkedList<Wizyty>();

        System.out.println("Witaj w systemie rejestracji");

        Scanner sc = new Scanner(System.in);

        int select = 0;

        while (true) {

            {
                System.out.println("[1] Dodaj dane adresowe");
                System.out.println("[2] Dodaj lekarza");
                System.out.println("[3] Dodaj pacjenta");
                System.out.println("[4] Wyjdź!");

                select = sc.nextInt();
                if (select != 4) {

                    switch (select)

                    {
                        case 1:

                         break;

                        case 2:

                            break;

                        case 3:

                            break;

                        default:
                            break;
                    }

                }else {
                    break;
                }

            }
        }
    }
}
