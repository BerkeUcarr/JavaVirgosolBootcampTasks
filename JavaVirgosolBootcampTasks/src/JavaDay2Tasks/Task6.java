package JavaDay2Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz: ");
        String cümle = scanner.nextLine();

        if (cümle.length() < 50){
            System.out.println("Kısa bir cümle girdiniz. ");
        } else {
            System.out.println("Uzun bir cümle girdiniz.");
        }
        scanner.close();
    }

}
/*
= Açıklama =
Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

= Örnek Girdi =
Bir cümle giriniz: Merhaba, nasılsınız?

= Örnek Çıktı =
Kısa bir cümle
*/