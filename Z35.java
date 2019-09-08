//Найдите количество четных цифр данного натурального числа.
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int count = 0;

        while (a != 0){
            int dig = a % 10;
//            System.out.println(dig);
           if (dig % 2 == 0){
               count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}
