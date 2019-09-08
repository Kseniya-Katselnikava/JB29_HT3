//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z29 {
    public static void main(String[] args) {
        int a, b, b1, digA, digB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b1 = sc.nextInt();
        System.out.println("Цифры, входящие в запись чисел а и b:");
        while (a != 0){
            digA = a % 10;
            b = b1;
            while (b != 0) {
                digB = b % 10;

                if (digA == digB){
                    System.out.print(digA + "\t");
                }
                b /= 10;
            }
            a /= 10;
        }
    }
}
