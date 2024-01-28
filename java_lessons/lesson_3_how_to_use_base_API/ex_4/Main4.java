package java_lessons.lesson_3_how_to_use_base_API.ex_4;

import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;

/*
 * Задание №4
Каталог товаров книжного магазина сохранен в виде двумерного
списка List<ArrayList<String>> так, что на 0й позиции каждого
внутреннего списка содержится название жанра, а на остальных
позициях - названия книг. Напишите метод для заполнения данной
структуры.
 */
public class Main4 {
    public static void main(String[] args) {
        List<List<String>> catalog = new ArrayList<>();

        addBook(catalog, "Roman", "War & Peace");
        addBook(catalog, "Adventure", "Prince of Percia");
        addBook(catalog, "Action", "Hitman");
        addBook(catalog, "Roman", "Master & Margarette");

        System.out.println(catalog);
    }

    static void addBook(List<List<String>> catalog, String genre, String name) {
        for (List<String> shelf : catalog) {
            if (shelf.get(0).equals(genre)) {
                shelf.add(name);
                return;
            }
        }
        List<String> newShelf = new ArrayList<>();
        newShelf.add(genre);
        newShelf.add(name);
        catalog.add(newShelf);
    }
}
