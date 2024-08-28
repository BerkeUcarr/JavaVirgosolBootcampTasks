package JavaDay3Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Alt limit giriniz: ");
        int altLimit = scanner.nextInt();

        System.out.println("Üst limit giriniz: ");
        int ustLimit = scanner.nextInt();

        int sayi, sayininTersi, gercekSayi;
        int toplam = 0;

        for (sayi = altLimit; sayi <= ustLimit; sayi++){
            gercekSayi = sayi;
            sayininTersi = 0;

            while (sayi != 0){
                sayininTersi = (sayininTersi * 10) + (sayi % 10);
                sayi /= 10;
            }

            sayi = gercekSayi;
            if (sayininTersi == gercekSayi) {
                System.out.println(sayi);
                toplam = toplam + sayi;
            }
        }

        System.out.println("Toplam: " + toplam);
        scanner.close();
    }
}
/*
Bir aralık belirleyerek (örneğin 1 ile 1000 arası) bu aralıktaki palindromik sayıların toplamını hesaplayan bir Java programı yazın.
Palindromik sayılar, aynı şekilde okunan sayılardır (örneğin 121, 131).
*/