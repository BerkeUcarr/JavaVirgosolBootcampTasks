package JavaDay2Tasks;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

        if (kelime.contains(" ")){
            System.out.println("Lütfen sadece bir kelime giriniz");
        } else{
            System.out.println("Kelimenin uzunluğu: " + kelime.length());
        }
        scanner.close();
    }
}
/*
= Açıklama =
Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

= Örnek Girdi =
Bir kelime giriniz: merhaba

= Örnek Çıktı =
Kelimenin uzunluğu: 7
*/
