package java_lessons.lesson_2_why_we_need_API.ex_3;
/*
 * Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

Полиндром - Слово или фраза, которые одинаково читаются слева направо и справа налево.
 */
public class Main3 {
    public static void main(String[] args) {
        String phrase = "а роза азора ";
        System.out.println(isPoli(phrase));
    }

    static Boolean isPoli(String str) {
        char[] charStr = str.replaceAll(" ", "").toLowerCase().toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            if (charStr[i] != charStr[charStr.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
