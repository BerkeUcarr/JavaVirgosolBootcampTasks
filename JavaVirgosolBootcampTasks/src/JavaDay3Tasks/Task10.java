package JavaDay3Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        for (int i = sayi; i != 0 ; i /= 10) {
            toplam += (i %10);
        }

        System.out.println("Rakamların toplamı: " + toplam);
        scanner.close();
    }
}
// "For" döngüsü kullanarak bir sayının basamaklarını toplayan bir Java programı yazın.