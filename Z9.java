//Найти сумму квадратов первых ста чисел.
package by.epam.jb29.task03;

public class Z9 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 100) {
            sum += Math.pow(a, 2);
//            System.out.println(sum);
            a += 1;
        }
        System.out.println(sum);
    }
}
