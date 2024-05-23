package java_lessons.lesson_4_data_storage_and_processing_part_2.ex_2;

import java.util.HashMap;
import java.util.Stack;

/*
 * Задание №2
Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3)       - истина
Пример 2: [a+(1*3)      - ложь
Пример 3: [a+(1]*3)     - ложь
Пример 4: [6+(3*3)]     - истина
Пример 5: {a}[+]{(d*3)} - истина
Пример 6: <{a}+{(d*3)}> - истина
Пример 7: {a+]}{(d*3)}  - ложь
 */
public class Main2 {
    public static void main(String[] args) {
        String[] equations = new String[] {"a+(d*3)",
                                           "[a+(1*3)",
                                           "[a+(1]*3)",
                                           "[6+(3*3)]",
                                           "{a}[+]{(d*3)}",
                                           "<{a}+{(d*3)}>",
                                           "{a+]}{(d*3)}"};

    
        for (int i = 0; i < equations.length; i++) {
            String str = new StringBuilder(equations[i]).append(" -> ").append(checkBrackets(equations[i])).toString();
            System.out.println(str.toString());
        }
    }

    static boolean checkBrackets(String s) {
        
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('<', '>');

        Stack<Character> stack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (brackets.containsKey(character)) {
                stack.push(character);
            } else if (brackets.containsValue(character)) {
                if (stack.empty() || !character.equals(brackets.get(stack.pop()))) {
                    return false;   
                }
            }
        }
        return stack.empty();
    }

}