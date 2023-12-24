package java_lessons.lesson_2_why_we_need_API.test;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8.name());
        System.out.println("Введи фразу");
        String str = scan.nextLine();
        System.out.println("Твоя фраза: " + str);
    }
}
