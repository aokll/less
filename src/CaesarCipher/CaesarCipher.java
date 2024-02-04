package CaesarCipher;


/**
 * Написать метод «Шифр Цезаря», с булевым параметром зашифрования и
 * расшифрования и числовым ключом
 */
public class CaesarCipher {
    /**
     * Метод зашифровывает строку text, при помощи ключа key
     * @param flag - шифровать или нет
     * @param key - ключ шифрования
     * @param text - текст шифрования
     * @return - возвращает зашифрованный текст
     */
    public String cipher(boolean flag, int key, String text){
        if(flag){
            char [] ch = text.toCharArray();
            char [] encrypted_mass = new char[ch.length];
            for (int i = 0; i < ch.length; i++) {
                   encrypted_mass[i] = stMet(key,ch[i]);
            }
            return text + "->" + new String(encrypted_mass);
        }else return text;
    }

    /**
     * Метод который перебирает значения алфавита, и ищет новые значения
     * @param key - ключ шифрования
     * @param c - символ
     * @return - возвращает измененный символ
     */
    public static char stMet(int key, char c){
        char res = 0;
        char [] chg = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};
        for (int i = 0; i < chg.length; i++) {
            if (chg[i] == c){
                if ((i + key) > chg[i - 1]){
                    res = chg[i];
                }else
                res = chg[i + key];
        }
        }
        return res;
    }

}
