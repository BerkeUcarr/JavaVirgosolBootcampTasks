package JavaDay3Tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.next();

        String kelimeninTersi = "";

        for (int i = kelime.length() -1; i >= 0; i--) {
            kelimeninTersi += kelime.charAt(i);
        }

        if (kelime.equalsIgnoreCase(kelimeninTersi)){
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit değil");
        }

        scanner.close();
    }
}
/*
Verilen bir String kelimenin palindromik olup olmadığını bulan bir Java programı yazın.
Palindromik, ileri ve geri okunduğunda aynı olan kelimedir (örnek: "kayak").
*/