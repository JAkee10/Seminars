package java_lessons.lesson_5_data_storage_and_processing_part_2.ex_0;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Задание №0
 
Создать структуру для хранения Номеров паспортов и Фамилий
сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов

Вывести данные по сотрудникам с фамилией Иванов.
 */

public class Main {
    public static void main(String[] args) {
        boolean work = true;
        boolean search = false;
        Integer userPassport = null;
        String userLastName = null;
        String lastNameToFind = null;
        Scanner scanner = new Scanner(System.in);

        UserData db = new UserData();

        while (work) {
            System.out.print("Введи номер паспорта для добавления ИЛИ фамилию для поиска: ");
            if (scanner.hasNextInt()) {
                userPassport = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Теперь введи фамилию: ");
                userLastName = scanner.nextLine();
                System.out.println();
            } else if (scanner.hasNext("stop")) {
                work = false;
            } else {
                lastNameToFind = scanner.nextLine();
                search = true;
            }

            if (!search) {
                db.add(userPassport, userLastName);
            } else if (search) {
                System.out.println(db.findByLastName(lastNameToFind));
                search = false;
            } else { }
        }

    }
}
