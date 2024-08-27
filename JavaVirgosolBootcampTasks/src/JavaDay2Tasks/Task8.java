package JavaDay2Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz. ");
        int sayi = scanner.nextInt();

        if(sayi%5 == 0 && sayi%3 == 0) {
            System.out.println("Sayı 3e ve 5e tam olarak bölünebilir");
        } else if (sayi % 5 == 0 && sayi % 3 != 0) {
            System.out.println("Sayı 5e bölünebilir 3e bölünemez");
        } else if (sayi % 5 != 0 && sayi % 3 == 0) {
            System.out.println("Sayı 3e bölünebilir 5e bölünemez");
        } else {
            System.out.println("Sayı ne 3e ne de 5e bölünür");
        }
        scanner.close();
    }
}
/*
= Açıklama =
Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının 3 ve 5 ile bölünebilir olup olmadığını belirten programı yazınız.

= Örnek Girdi =
Bir tam sayı giriniz: 15

= Örnek Çıktı =
Sayı hem 3 hem de 5 ile bölünebilir
*/