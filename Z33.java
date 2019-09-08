//Найдите наибольшую цифру данного натурального числа.
package by.epam.jb29.task03;

import java.util.Scanner;

public class Z33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();
        int max = 0;
        while (x != 0){
            int dig = x % 10;
            if (dig > max){
                max = dig;
            }
            x /= 10;
        }
        System.out.println(max);
    }
}
