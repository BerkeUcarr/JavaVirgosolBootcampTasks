package JavaDay3Tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();

        int ilkSayi = 1;
        int ikinciSayi = 2;
        System.out.println(ilkSayi);

        while (ilkSayi <= sayi){
            System.out.println(ilkSayi);
            int sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;

        }

        scanner.close();
    }
}
// Kullanıcıdan alınan bir sayıya kadar Fibonacci serisini "while" döngüsü kullanarak yazdıran bir Java programı yazın.
