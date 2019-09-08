//С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
package by.epam.jb29.task03;

public class Z5 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 99) {
            sum = sum + a;
            a += 2;
        }
        System.out.println(sum);
    }
}
