package JavaDay2Tasks;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen aldığınız notu giriniz. ");
        int not = scanner.nextInt();

        if (not >= 0 && not <= 100){
            if (not >= 90){
                System.out.println('A');
            } else if (not >= 80)  {
                System.out.println('B');
            } else if (not >= 70) {
                System.out.println('C');
            } else if (not >= 60) {
                System.out.println('D');
            } else {
                System.out.println('F');
            }
            } else {
            System.out.println("Lütfen geçerli bir not giriniz: ");
        }

        scanner.close();
    }
}
/*
= Açıklama =
Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
Program her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	- 90-100: A
	- 80-89:  B
	- 70-79:  C
	- 60-69:  D
	- 0-59:   F

= Örnek Girdi =
Bir puan giriniz: 85

= Örnek Çıktı =
Not: B
*/
