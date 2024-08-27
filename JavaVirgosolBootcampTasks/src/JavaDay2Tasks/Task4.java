package JavaDay2Tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenar uzunluğunu giriniz: ");
        int kenar1 = scanner.nextInt();

        System.out.println("İkinci kenar uzunluğunu giriniz: ");
        int kenar2 = scanner.nextInt();

        System.out.println("Üçüncü kenar uzunluğunu giriniz: ");
        int kenar3= scanner.nextInt();

        if(kenar1 > 0 && kenar2 > 0 && kenar3 > 0){
            if (kenar1 == kenar2 && kenar1 == kenar3) {
                System.out.println("Eşkenar üçgen");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("İkizkenar üçgen");
            } else {
                System.out.println("Çeşitkenar üçgen");
            }
        } else{
            System.out.println("Üçgenin bir kenarı sıfır veya eksi bir sayı olamaz");
        }
        scanner.close();
    }
}
/*
= Açıklama =
Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

= Örnek Girdi =
Birinci kenar uzunluğunu giriniz: 5
İkinci kenar uzunluğunu giriniz: 5
Üçüncü kenar uzunluğunu giriniz: 5

= Örnek Çıktı =
Bu üçgen eşkenar üçgendir
*/