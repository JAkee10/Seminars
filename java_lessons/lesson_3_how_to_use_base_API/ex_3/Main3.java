package java_lessons.lesson_3_how_to_use_base_API.ex_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Задание №3
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class Main3 {
    public static void main(String[] args) {
        List<Object> list = new ArrayList();
        list.add(1);
        list.add(15);
        list.add(30);
        list.add("Nice");
        list.add("create");
        list.add(36.6);
        list.add(100);
        list.add(null);
        
                    // Перебор обычным циклом
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) instanceof Integer) {
        //         list.remove(i);
        //         i--;
        //     }
        // }
        
                    // Перебор итератором
        // Iterator<Object> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     if (iterator.next() instanceof Integer) {
        //         iterator.remove();
        //     }
        // }
        
                    // Перебор с помощью лямбда выражения (Stream)
        list.removeIf(x -> x instanceof Integer);

        System.out.println(list);
    }
}
