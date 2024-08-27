package JavaDay2Tasks;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi < 0){
            System.out.println("Sayı negatiftir");
        } else if (sayi == 0) {
            System.out.println("Sayı sıfırdır.");
        } else {
            System.out.println("Sayı pozitiftir.");
        }
        scanner.close();
    }
}
/*
= Açıklama =
Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu belirten programı yazınız.

= Örnek Girdi =
Bir tam sayı giriniz: 0

= Örnek Çıktı =
Sayı sıfırdır
*/