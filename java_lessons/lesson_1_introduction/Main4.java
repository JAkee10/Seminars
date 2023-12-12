package java_lessons.lesson_1_introduction;

import java.util.Scanner;

/*
 * Задание №6 (доп)
Реализовать функцию возведения числа а в степень b. a, b из Z.
Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;
        System.out.print("Введи число: ");
        boolean isDigit = scanner.hasNextInt();
        if (isDigit)
            a = scanner.nextInt();
        else
            System.out.println("Введено НЕ число");
        System.out.print("Введи степень: ");
        isDigit = scanner.hasNextInt();
        if (isDigit) {
            b = scanner.nextInt();


            // System.out.println("Рекурсивный метод:\n" + a + " в степени " + b + " = " + recPow(a, b));
            System.out.println("Итеративный метод:\n" + a + " в степени " + b + " = " + pow(a, b));

            
        }
        else
            System.out.println("Введено НЕ число");
    }

    static double recPow(double number, double power) {
        if (power == 0.0){
            return 1;
        } else if (power < 0) {
            return recPow(1/number, -power);
        } else {
            return number * recPow(number, power - 1);
        }
    }

    static double pow(double number, double power) {
        if (power == 0 || number == 1) {
            return 1;
        }
        else if (number == 0) {
            return 0;
        }
        else {
            double result = 0;
            if (power < 0) {
                number = 1.0 / number;
                power = Math.abs(power);
            }
            power--;
            while (power != 0) {
                result += number * number;
                power--;
            }
            return result;
        }
    }



}
