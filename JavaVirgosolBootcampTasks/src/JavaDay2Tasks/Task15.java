package JavaDay2Tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yıl giriniz:");
        int yil = scanner.nextInt();


            if((yil % 4 == 0 && yil % 100 != 0 || (yil % 400 == 0))){
                System.out.println(yil + " artık bir yıldır.");
            } else {
                System.out.println(yil + " artık bir yıl değildir.");
            }
            scanner.close();
        }
    }

/*
= Açıklama =
Girilen bir yılın artık yıl olup olmadığını belirleyen bir Java programı yazınız.
Programınızın çıktısı, yılın artık yıl olup olmadığını doğru bir şekilde göstermelidir.

= Not =
Artık yıl, 365 yerine 366 günü olan yıl:
  - 4'ün katı olan yıllar artık yıldır.
  - 100'ün katı olan yıllardan ise sadece 400'e kalansız bölünebilen yıllar artık yıldır.

= Örnek Girdi =
Bir yıl giriniz: 2020

= Örnek Çıktı =
2020 bir artık yıldır.
*/