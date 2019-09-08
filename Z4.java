//С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
package by.epam.jb29.task03;

public class Z4 {
    public static void main(String[] args) {
        int a = 2;
        while (a <= 100) {
            System.out.println(a);
            a += 2;
        }
    }
}
