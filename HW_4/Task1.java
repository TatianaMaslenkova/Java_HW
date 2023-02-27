/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
package HW_4;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
public class Task1 {
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> initialLinkedList = new LinkedList<Integer>();
        initialLinkedList.add(1);
        initialLinkedList.add(2);
        initialLinkedList.add(3);
        initialLinkedList.add(4);
        initialLinkedList.add(5);
        System.out.println(initialLinkedList);
        // Collections.reverse(initialLinkedList); // с использованием встроенного метода Collections.reverse () 
        // System.out.println(initialLinkedList);
        initialLinkedList = reverseLinkedList(initialLinkedList); // с использованием отдельно написанного метода, в котором переворачивание реализовано через цикл
        System.out.println(initialLinkedList);
    }
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> initList) {
        LinkedList<Integer> reversedLinkedList = new LinkedList<Integer>();

        for (int i = initList.size() - 1; i >= 0; i--) {
            reversedLinkedList.add(initList.get(i));

        }
        return reversedLinkedList;

    } 
}
