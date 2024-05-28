package object_oriented_programming.lesson_1_OOP_principles_encapsulation_inheritance_polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point2D {
    private static Random rand = new Random();

    protected static List<Integer[]> closedPos = new ArrayList<>();
    
    protected int x, y;


    public Point2D(int x, int y) {
        Integer[] pos = {x, y};
        while (closedPos.contains(pos)) {
            pos[0] = rand.nextInt(100);
            pos[1] = rand.nextInt(100);
        }
        this.x = pos[0];
        this.y = pos[1];
        closedPos.add(pos);
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(rand.nextInt(10), rand.nextInt(10));
    }

    @Override
    public String toString() {
        return String.format("X: %d, Y: %d", x, y);
    }
}
