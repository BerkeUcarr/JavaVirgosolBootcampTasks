package JavaDay3Tasks;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayac;

        System.out.println("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();


        for (int i = 0; i < cumle.length(); i++){
            sayac = 0;

            for (int j = 0; j < cumle.length(); j++) {
                if (cumle.charAt(i) == cumle.charAt(j)){
                    sayac++;
                }
            }
            if (sayac == 1){
                System.out.println(cumle.charAt(i) + " ");
            }
        }

        scanner.close();
    }
}
/*
Verilen bir string içerisindeki benzersiz karakterleri bulan ve bunları ekrana yazdıran bir Java programı yazın.
Benzersiz karakterler, string içerisinde sadece bir kez geçen karakterlerdir.
*/