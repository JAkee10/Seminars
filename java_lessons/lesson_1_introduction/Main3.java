package java_lessons.lesson_1_introduction;

import java.util.Arrays;

/*
 * Задание №5 (доп)
Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */
public class Main3 {
    public static void main(String[] args) {
        String phrase = "Добро пожаловать на курс по Java";
        String reversedPhrase = reverse(phrase);
        System.out.println(reversedPhrase);
    }

    static String reverse(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (i != 0) {
                result += words[i] + " ";
            } else {
                result += words[i];
            }
        }
        return result;
    }

}
