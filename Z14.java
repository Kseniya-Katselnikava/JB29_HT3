//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        double b = 1;
        double sum = 0;
        while (b <= n) {
            sum += 1/b;
//            System.out.println(sum);
            b += 1;
        }
        System.out.println(sum);
    }
}
