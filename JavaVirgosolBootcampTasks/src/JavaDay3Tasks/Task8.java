package JavaDay3Tasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        while ( sayi != 0) {
            toplam = toplam + (sayi % 10);
            sayi = sayi / 10;
        }

        System.out.println(toplam);
        scanner.close();
    }
}
// Bir sayının basamaklarını toplayan ve "while" döngüsü kullanan bir Java programı yazın.