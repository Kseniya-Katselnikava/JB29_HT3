//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z34 {
    public static void main(String[] args) {
       int a, x = 15;
       int count = 0;

       for (int b = 1000; b <= 9999; b++){
           int sum = 0;
           a = b;
           while (a != 0){
               int dig = a % 10;
               a = a / 10;
               sum += dig;
           }
           if (sum == x) {
               count++;
               System.out.println(b);
           }
       }
        System.out.println("Всего чисел, сумма которых равна 15: " + count);
    }
}
