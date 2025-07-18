package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] guests = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        System.out.println("Inserisci il tuo nome!");
        String guestName = sc.nextLine().toLowerCase().strip();

        boolean isGuest = false;

        // FOR
        for (int i = 0; !isGuest && i < guests.length; i++) {

            if (guestName.equals(guests[i].toLowerCase())) {
                isGuest = true;
            }
        }

        // int index = 0;

        // WHILE
        // while (!isGuest && index < guests.length) {
        // if (guestName.equals(guests[index].toLowerCase())) {
        // isGuest = true;
        // } else {
        // index++;
        // }
        // }

        // DO WHILE
        // do {
        // if (guestName.equals(guests[index].toLowerCase())) {
        // isGuest = true;
        // } else {
        // index++;
        // }
        // } while (!isGuest && index < guests.length);

        String response = isGuest ? "Accesso consentito!" : "Accesso negato!";
        System.out.println(response);

        sc.close();
    }
}
