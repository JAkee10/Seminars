package java_lessons.lesson_4_data_storage_and_processing_part_2.ex_1;

import java.util.HashMap;
import java.util.Map;

/*
 * Задание №1
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
некоторую букву во втором слове, при этом
1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
2. буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("bar", "foo"));
    }

    static boolean isIsomorphic(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> coder = new HashMap<>();
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        if (s1.length() != s2.length()) {
            return false;
        } 
        for (int i = 0; i < s1.length(); i++) {
            if (!coder.containsValue(charArray2[i])) {
                coder.put(charArray1[i], charArray2[i]);
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            sb.append(coder.get(charArray1[i]));
        }

        if (sb.toString().equals(s2)) {
            return true;
        } else return false;
    }
}
