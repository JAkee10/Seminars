package java_lessons.lesson_3_how_to_use_base_API.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        int a = 5;
        String s = "Привет";

        test(list, a, s);

        System.out.println(list);
        System.out.println(a);
        System.out.println(s);
    }

    static void test(List<Integer> list, int a, String s) {
        a++;
        list.add(a);
        s = "Пока";
    }
}
