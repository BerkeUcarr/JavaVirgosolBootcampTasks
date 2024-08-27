package JavaDay2Tasks;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int sayi = scanner.nextInt();

        System.out.println("Sayı: " + sayi);
        System.out.println("Sayının karesi: " + sayi * sayi);
        System.out.println("Sayının küpü: " + sayi * sayi * sayi);

    }
}
/*
= Açıklama =
Bir tam sayının karesini ve küpünü hesaplayan bir Java programı yazınız.
Program girdiyi almalı ve çıktı olarak karesini ve küpünü göstermelidir.

= Örnek Girdi =
Bir tam sayı giriniz: 3

= Örnek Çıktı =
Karesi: 9
Küpü: 27
*/