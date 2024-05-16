package java_lessons.lesson_4_data_storage_and_processing_part_1.ex_4;

/*
 * Задание №4
Реализовать стэк с помощью массива.
Нужно реализовать методы:
size(), empty(), push(), peek(), pop().
 */
public class Main4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        for (int i = 0; i < 33; i++) {
            stack.push(i);
        }

        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek()%2 == 1) {
                System.out.println(stack.pop());
            }
            else {
                stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
