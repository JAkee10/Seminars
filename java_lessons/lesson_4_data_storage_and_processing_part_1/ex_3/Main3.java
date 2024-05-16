package java_lessons.lesson_4_data_storage_and_processing_part_1.ex_3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * Задание №3
1) Написать метод, который принимает массив элементов, помещает их в стэк
и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в
очередь и выводит на консоль содержимое очереди.
 */
public class Main3 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        printAsQueue(arr);
    }

    static void printAsStack(Integer[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));

        while (!stack.empty()) {
            System.out.println(stack.pop()); // .pop - извлекает ПОСЛЕДНИЙ добавленный элемент
        }
    }

    static void printAsQueue(Integer[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
