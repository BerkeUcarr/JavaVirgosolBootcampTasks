package JavaDay3Tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        boolean asalKontrol = true;

        if (sayi > 1) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalKontrol = false;
                    break;
                }
            }
            System.out.println("Girdiğiniz sayi asal mı? " + asalKontrol);
        }
        scanner.close();
    }
}
// Bir sayının asal olup olmadığını "for" döngüsü kullanarak kontrol eden bir Java programı yazın.