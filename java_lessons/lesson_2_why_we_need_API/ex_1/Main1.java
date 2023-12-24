package java_lessons.lesson_2_why_we_need_API.ex_1;

import java.util.Scanner;

/*
 * Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

Ответ: c1c2c1…c2 (всего N символов)
 */
public class Main1 {
    public static void main(String[] args) {
        int n = 7;
        char c1 = 'ё';
        char c2 = 'у';

        System.out.println(getString(n, c1, c2));
    }

    static String getString(int n, char c1, char c2) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) strBuilder.append(c1);
            else strBuilder.append(c2);
        }
        return String.valueOf(strBuilder);
    }
}
