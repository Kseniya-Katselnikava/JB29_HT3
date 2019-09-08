//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа
package by.epam.jb29.task03;

import java.util.Scanner;

public class Z6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int b = 1;
        int sum = 0;
        while (b <= a) {
            sum = sum + b;
            b += 1;
        }
        System.out.println(sum);
    }
}
