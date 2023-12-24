package java_lessons.lesson_2_why_we_need_API.ex_2;
/*
 * Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.

Результат: a4b3cd2
 */
public class Main2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(stringZip(str));

    }

    static String stringZip(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] charStr = str.toCharArray();
        int charCounter = 0;
        char testerChar = charStr[0];

        for (int i = 0; i < charStr.length; i++) {
            if (testerChar != charStr[i]) {
                strBuilder.append(testerChar);
                if (charCounter != 1) strBuilder.append(charCounter);
                testerChar = charStr[i];
                charCounter = 1;
            }
            else {
                charCounter++;
            }
        }
        strBuilder.append(testerChar);
        if (charCounter != 1) strBuilder.append(charCounter);
        return strBuilder.toString();
    }
}
