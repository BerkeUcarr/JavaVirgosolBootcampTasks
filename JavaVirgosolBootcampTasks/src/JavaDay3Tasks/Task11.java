// Kodu Barış'tan aldım. Birkaç kez daha incele

package JavaDay3Tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Girdiğiniz cümlede tekrar eden karakterleri silen program");
        String string = scanner.nextLine();

        String tekrarlananKarakterler = "";

        for (int i = 0; i < string.length(); i++) {
            char karakter = string.charAt(i);
            if (tekrarlananKarakterler.indexOf(karakter) != -1) { continue; }

            for (int j = i + 1; j < string.length(); j++) {
                if (karakter == string.charAt(j)) {
                    tekrarlananKarakterler += karakter;
                    break;
                }
            }
        }

        System.out.println(tekrarlananKarakterler);

        scanner.close();
    }
}
// "For" döngüsü kullanarak bir String ifadede tekrar eden karakterleri bulan bir Java programı yazın.