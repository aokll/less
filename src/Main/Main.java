package Main;

import CaesarCipher.CaesarCipher;

/**
 * Главный метод, где создается обьект класса в котором написан запускаемый метод
 */
public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        System.out.println(caesarCipher.cipher(true,2,"Hello World"));
    }
}