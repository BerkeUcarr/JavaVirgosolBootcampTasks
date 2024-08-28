package JavaDay3Tasks;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sonuc = 0, sayi;

        do {
            System.out.println("Lütfen bir sayı giriniz: ");
            sayi = scanner.nextInt();
            sonuc = sonuc + sayi;
        } while (sayi != 0);

        System.out.println("Toplam: " + sonuc);
        scanner.close();
    }
}
// Kullanıcıdan alınan sayılarla toplama işlemi yapan ve kullanıcı 0 girene kadar devam eden "do-while" döngüsü kullanan bir Java programı yazın.