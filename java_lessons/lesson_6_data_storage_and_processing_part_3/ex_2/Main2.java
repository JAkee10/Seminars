package java_lessons.lesson_6_data_storage_and_processing_part_3.ex_2;
/*
 * Задание №2
Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.

Задание №3
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно
использовать не все придуманные поля и методы. Создайте несколько
экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась
его кличка, цвет и возраст (или другие параметры на ваше усмотрение).

Задание №4
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.
Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод
должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать
Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
*/

import java.util.HashSet;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        
        
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.age = 5;
        cat1.kind = "Британский";
        cat1.ownerName = "Саша Плов";
        
        Cat cat2 = new Cat();
        cat2.name = "Пушок";
        cat2.age = 7;
        cat2.kind = "Дворняга";
        cat2.ownerName = "Галина Малина";
        
        Cat cat3 = new Cat();
        cat3.name = "Рыжик";
        cat3.age = 3;
        cat3.kind = "Шотландский";
        cat3.ownerName = "Василий Иваныч";
        
        Cat cat4 = new Cat();
        cat4.name = "Крош";
        cat4.age = 1;
        cat4.kind = "Сфинкс";
        cat4.ownerName = "Олег Петров";
        
        Cat cat5 = new Cat();
        cat5.name = "Крош";
        cat5.age = 1;
        cat5.kind = "Сфинкс";
        cat5.ownerName = "Олег Петров";

        // System.out.println(cat1);
        // System.out.println(cat2);
        // System.out.println(cat3);
        // System.out.println(cat4);
        
        Set<Cat> cats = new HashSet<>();

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        System.out.println(cat4.equals(cat5));
        // printSet(cats);

        printSet(findByAge(cats, 3));

    }

    static void printSet(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    static Set<Cat> findByAge(Set<Cat> cats, int minAge) {
        Set<Cat> result = new HashSet<>();
        for (Cat cat : cats) {
            if (cat.age >= minAge) {
                result.add(cat);
            }
        }
        return result;
    }

}
