/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
package HW_3;
import java.util.ArrayList;
import java.util.Random;
public class HW3_Task2 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        ArrayList<Integer> initialList = new ArrayList<>();        
        for (int i = 0; i < 10; i++) {
            initialList.add(randomGenerator.nextInt(100));  
        }
        System.out.println("Изначальный список:");
        System.out.println(initialList);
        initialList.removeIf(num -> num%2==0);      
        System.out.println("Список после удаления четных чисел:");
        System.out.print(initialList);
    }
}
