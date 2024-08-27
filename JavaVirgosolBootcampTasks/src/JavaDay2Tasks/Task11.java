package JavaDay2Tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.println("Kontrol edilecek kelimeyi giriniz: ");
        String kontrolKelime = scanner.nextLine();

        if (cumle.toLowerCase().startsWith(kontrolKelime.toLowerCase())){
            System.out.println("Cümle " + kontrolKelime + " ile başlıyor.");
        } else {
            System.out.println("Cümle " + kontrolKelime + " ile başlamıyor.");
        }
        scanner.close();
    }

}
/*
= Açıklama =
Girilen bir cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol eden bir program yazın.

= Örnek Girdi =
Bir cümle giriniz: Java programlama dili
Kontrol edilecek kelime: Java

= Örnek Çıktı =
Cümle "Java" ile başlıyor.
*/