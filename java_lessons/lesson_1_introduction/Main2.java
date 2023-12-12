package java_lessons.lesson_1_introduction;

import java.util.Arrays;

/*
 * Задание №3
Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */
public class Main2 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 3};
        int[] result = sort(nums, 3);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr, int num) {
        int[] res = new int[arr.length];
        int index = 0;
        for (int el : arr) {
            if (el != num) {
                res[index] = el;
                index++;
                // System.out.println(Arrays.toString(res));
            }
        }
        for (int i = index; i < res.length; i++) {
            res[i] = num;
        }
        return res;
    }

    static int[] sort2(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num && i != arr.length) {
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
            }
        }
        return arr;

    }


}
