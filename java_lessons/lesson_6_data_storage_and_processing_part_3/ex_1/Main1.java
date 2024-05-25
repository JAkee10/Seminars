package java_lessons.lesson_6_data_storage_and_processing_part_3.ex_1;
/*
 * Задание №1
1. Напишите метод, который заполнит массив из 1000 элементов случайными
цифрами от 0 по 24.
2. Создайте метод, в который передайте заполненный выше массив и с
помощью Set вычислите процент уникальных значений в данном массиве и
верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее
количество чисел в массиве.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Integer[] arr = fillArray(0, 24, 10);
        System.out.println(Arrays.asList(arr));
        System.out.println(findUniPercent(arr));
    }

    static Integer[] fillArray(int min, int max, int size) {
        Random rand = new Random();
        Integer[] result = new Integer[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(max - min + 1) + min;
        }
        return result;
    }

    static float findUniPercent(Integer[] arr) {
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() * 100.0f / arr.length;
    }
}
