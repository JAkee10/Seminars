package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    static int teamSize = 10;
    static int heroesTypeCount = 4;

    public static void main(String[] args) {

        List<Hero> teamRed = new ArrayList<>();
        List<Hero> teamBlue = new ArrayList<>();

        teamRed = GetListHeroes(0);
        teamBlue = GetListHeroes(3);

        System.out.println("Красная команда:");
        teamRed.forEach(n -> System.out.println(n.toString()));

        System.out.println("\nСиняя команда:");
        teamBlue.forEach(n -> System.out.println(n.toString()));

    }

    static List<Hero> GetListHeroes(int teamSide) {
        List<Hero> result = new ArrayList<>();
        for (int i = 0; i < teamSize; i++) {
            int key = Hero.rand.nextInt(heroesTypeCount) + teamSide;
            switch (key) {
                case 0:
                    result.add(new Monk(GetName()));
                    break;
                case 1:
                    result.add(new Crossbower(GetName()));
                    break;
                case 2:
                    result.add(new Pikeman(GetName()));
                    break;
                case 3:
                    result.add(new Peasant(GetName()));
                    break;
                case 4:
                    result.add(new Wizard(GetName()));
                    break;
                case 5:
                    result.add(new Sniper(GetName()));
                    break;
                case 6:
                    result.add(new Rogue(GetName()));
                    break;
            }
        }
        return result;
    }

    static String GetName() {
        return HeroNames.values()[new Random().nextInt(HeroNames.values().length)].name();
    }
}
