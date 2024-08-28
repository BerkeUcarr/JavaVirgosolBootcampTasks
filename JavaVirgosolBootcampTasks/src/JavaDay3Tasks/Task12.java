package JavaDay3Tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();


        System.out.println("Asal çarpanları: ");

        for (int i = 2; i <= sayi ; i++) {
            while (sayi % i == 0){
                System.out.println(i);
            sayi /= i;
        }
    }
        scanner.close();
}
/* 12. Bir sayının asal çarpanlarını bulan bir Java programı yazın.
Kullanıcının girdiği bir sayının asal çarpanlarını ve bu çarpanların sayısını ekrana yazdırın. */
}