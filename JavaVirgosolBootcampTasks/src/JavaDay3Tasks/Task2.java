package JavaDay3Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesaplatmak istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi >= 0){
            int sonuc = 1;

            for (int i = 1; i <= sayi; i++) {
                sonuc = sonuc * i;
            }
            System.out.println(sayi + "nın faktoriyeli: " + sonuc);
        }
        scanner.close();
    }
}
/*
Bir sayının faktöriyelini "for" döngüsü kullanarak hesaplayan bir Java programı yazın.
Örneğin; 5'in faktöriyeli 120'dir.
*/
