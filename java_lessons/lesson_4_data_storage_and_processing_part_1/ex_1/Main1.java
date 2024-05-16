package java_lessons.lesson_4_data_storage_and_processing_part_1.ex_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
 * Задание №1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по ~, сохранить text в связный список на
позицию num.
3. Если введено print~num, выводит строку из позиции num в связном
списке и удаляет её из списка.
 */
public class Main1 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        String str = "";
        while (flag) {
            System.out.print("Введи строку в формате text~num: ");
            str = scanner.nextLine();
            String[] strSplit;
            String text;
            int num;
            if (str.contains("~")) {
                strSplit = str.split("~");
                text = strSplit[0];
                num = Integer.parseInt(strSplit[1]);

                // Расширение списка до нужного индекса (num) В ЭТОМ НЕТ СМЫСЛА!!!
                if (num > list.size()) {
                    while (num-list.size() != 0) {
                        list.add(null);
                    }
                }

            } else {
                text = str;
                num = 0;
            }

            if (text.equals("print")) {
                System.out.println(list.remove(num));
            } else if (text.equals("finish")) {
                for (String string : list) {
                    System.out.println(string);
                }
                flag = false;
            } else {
            list.add(num, text);
            }
        }
    }
}
