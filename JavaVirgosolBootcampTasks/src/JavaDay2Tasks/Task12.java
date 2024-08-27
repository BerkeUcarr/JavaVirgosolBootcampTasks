package JavaDay2Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Girmek istediğiniz ayı giriniz: (1-12 arasında olmalıdır)");
        int aySırası = scanner.nextInt();

        if (aySırası < 13 && aySırası > 0){
            switch (aySırası){
                case 1:
                    System.out.println("Kış");
                    break;
                case 2:
                    System.out.println("Kış");
                    break;
                case 3:
                    System.out.println("İlkbahar");
                    break;
                case 4:
                    System.out.println("İlkbahar");
                    break;
                case 5:
                    System.out.println("İlkbahar");
                    break;
                case 6:
                    System.out.println("Yaz");
                    break;
                case 7:
                    System.out.println("Yaz");
                    break;
                case 8:
                    System.out.println("Yaz");
                    break;
                case 9:
                    System.out.println("Sonbahar");
                    break;
                case 10:
                    System.out.println("Sonbahar");
                    break;
                case 11:
                    System.out.println("Sonbahar");
                    break;
                case 12:
                    System.out.println("Kış");
                    break;
            }
        } else {
            System.out.println("Lütfen geçerli bir değer giriniz.");
        }

        scanner.close();
    }

}
/*
= Açıklama =
Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı "Switch-Case" kullanarak yazınız.

= Örnek Girdi =
Bir ay numarası giriniz (1-12): 7

= Örnek Çıktı =
Yaz mevsimindesiniz.
*/