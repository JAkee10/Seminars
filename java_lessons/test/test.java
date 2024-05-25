package java_lessons.test;

import java.util.Arrays;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        HashSet<Integer> b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var v = new HashSet<>(a);
        v.addAll(b);
        System.out.println(v);
    }
}

