package java_lessons.lesson_3_how_to_use_base_API.ex_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * Задание №5
Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
 */
public class Main5 {
    public static void main(String[] args) {
        String[] planetArray = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        List<String> planetList = new ArrayList<>();
        Random random = new Random();

        int n = 10;
        for (int i = 0; i < n; i++) {
            planetList.add(planetArray[random.nextInt(planetArray.length)]);
        }

        System.out.println(planetList);
        getCountOfEachPlanet(planetList, planetArray);
    }

    static void getCountOfEachPlanet(List<String> list, String[] array) {
        for (String string : array) {
            int c = Collections.frequency(list, string);
            System.out.println(string + ": " + c);
        }

        list.sort(null);
        System.out.println(list);


        // int counter = 1;
        // list.sort(null);
        // String temp = list.get(0);
        // String removedString = list.remove(0);
        // for (String string : list) {
        //     if (temp.equals(string)) {
        //         counter++;
        //     } else {
        //         System.out.println(temp + ": " + counter);
        //         temp = string;
        //         counter = 1;
        //     }
        // }
        // System.out.println(temp + ": " + counter);
        // list.add(removedString);
        // list.sort(null);
    }
}
