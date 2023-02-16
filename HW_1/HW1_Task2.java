/*
 * Вывести все простые числа от 1 до 1000
 */
package HW_1;
public class HW1_Task2 {
    public static void main(String[] args) {
        int number = 1000;
        for (int i = 2; i <= number; i++) {
            boolean primeNum = i >= 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeNum = false;
                    break;
                }
            }
            if(primeNum) {
                System.out.print(i + ", ");
            }
        }
    }
}
