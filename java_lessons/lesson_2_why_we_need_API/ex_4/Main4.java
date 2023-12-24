package java_lessons.lesson_2_why_we_need_API.ex_4;

import java.io.File;
import java.io.FileWriter;
import java.io.UTFDataFormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Задание №4
Напишите метод, который составит строку, состоящую из 100 
повторений слова TEST и метод, который запишет эту строку в 
простой текстовый файл, обработайте исключения.
 */
public class Main4 {
    static Logger logger = Logger.getAnonymousLogger();

    public static void main(String[] args) {
        String filePath = "java_lessons/lesson_2_why_we_need_API/ex_4/test.txt";
        String logPath = "java_lessons/lesson_2_why_we_need_API/ex_4/log.txt";
        String str = "test";
        int val = 10;

        createLogger(logPath);

        String res = repeat(str, val);
        writeToFile(filePath, res);
        readFile(filePath);

        closeLogger();
    }
    
    static void createLogger(String logPath){
        try {
            FileHandler handler = new FileHandler(logPath, true);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
            handler.setEncoding(StandardCharsets.UTF_8.name());
            logger.addHandler(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void closeLogger(){
        Handler[] handlers = logger.getHandlers();
        for (Handler handler : handlers) {
            handler.close();
        }
    }

    static void writeToFile(String filePath, String res) {
        try (FileWriter fw = new FileWriter(filePath, StandardCharsets.UTF_8, true)) {
            fw.write(res);
            fw.write("\n");
            logger.info("Запись в файл прошла успешно");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Запись в файл не удалась. Причина: " + e.getMessage());
        }
    }

    static void readFile(String filePath) {
        File file = new File(filePath);
        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8.name())) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
