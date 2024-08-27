package JavaDay2Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.println("Aranacak karakteri giriniz: ");
        char karakter = scanner.nextLine().charAt(0);

        for (int i = 0; i <= (metin.length()-1); i++) {
            if (metin.charAt(i) == karakter) {
                System.out.println("Karakter " + karakter + " " + i +". indekste bulunur.");
            }

        }
        scanner.close();
    }
}
/*
= Açıklama =
Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin indeksini bulan bir program yazınız.

= Örnek Girdi =
Bir metin giriniz: Merhaba Dünya
Aranacak karakter: a

= Örnek Çıktı =
Karakter 'a' 4. indekste bulunuyor.
*/