package JavaDay2Tasks;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0) {
            System.out.println("Girdiğiniz sayı negatiftir.");
        } else if (sayi == 0) {
            System.out.println("Girdiğiniz sayı ne negatif ne de pozitiftir. Sıfırdır.");
        } else {
            System.out.println("Girdiğiniz sayı pozitiftir.");
        }
    }
}
/*
= Açıklama =
Kullanıcıdan bir tam sayı girmesini isteyen ve eğer sayı negatif ise "Sayı negatiftir" mesajını yazdıran programı yazınız.

= Örnek Girdi =
Bir tam sayı giriniz: -5

= Örnek Çıktı =
Sayı negatiftir
*/