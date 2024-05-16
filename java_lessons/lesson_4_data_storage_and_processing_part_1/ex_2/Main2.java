package java_lessons.lesson_4_data_storage_and_processing_part_1.ex_2;
/*
 * Задание №2
 Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная
была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            // long timeStart = System.currentTimeMillis();
            System.out.print("Введи текст: ");
            String line = scanner.nextLine();
            switch (line) {
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size()); // из-за метода iterator.previous в строке 27, выставляем итератор за границу списка
                    while (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }

                    // for (int i = list.size()-1; i >= 0; i++) {
                    //     System.out.println(list.get(i));
                    // }
                    break;
                case "revert":
                    if (list.size() > 0) {
                        list.removeLast();
                    }
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(line);
            }
            // System.out.println(System.currentTimeMillis() - timeStart);
        }
    }
}


//---------------------------------------ЗАПОЛНЕНИЕ_СПИСКА_В_ОБРАТНОМ_ПОРЯДКЕ--------------------------------------------

// public class Main2 {
//     public static void main(String[] args) {
//         LinkedList<String> list = new LinkedList<>();
//         Scanner scanner = new Scanner(System.in);
//         boolean work = true;
//         while (work) {
//             long timeStart = System.currentTimeMillis();
//             System.out.print("Введи текст: ");
//             String line = scanner.nextLine();
//             switch (line) {
//                 case "print":
//                     for (String string : list) {
//                         System.out.println(string);
//                     }                    
//                     break;
//                 case "revert":
//                     if (list.size() > 0) {
//                         list.removeFirst();
//                     }
//                     break;
//                 case "finish":
//                     work = false;
//                     break;
//                 default:
//                     list.addFirst(line);
//             }
//             System.out.println(System.currentTimeMillis() - timeStart);
//         }
//     }
// }
