package java_lessons.lesson_5_data_storage_and_processing_part_2.ex_1;

import java.util.HashMap;
import java.util.Map;


public class Test {
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
            sb.append(coder.get(charArray1[i]));
        }

        if (sb.toString().equals(s2)) {
            System.out.println(sb.toString() + " -> " + s2); //TODO: Исправить (4-ая проверка не проходит)
            return true;
        } else {
            return false;
        }
    }
}

// Нужно либо использовать два цикла как в Main1.java, 
// либо убрать сравенение строк и ограничиться только 
// проерками на уникальность символов в коллекциях