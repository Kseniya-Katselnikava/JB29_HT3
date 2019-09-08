//Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. Преобразовать его в
//        другое число, цифры которого будут следовать в обратном порядке по сравнению с введенным числом
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = sc.nextInt();
        int sum = 0;
        String num = "";
        int number;

       while (a != 0){
            int dig = a % 10;
            System.out.println(dig);
            num += Integer.toString(dig);
            if (dig % 2 == 0){
                sum += dig;
            }
           a = a / 10;
        }
        number = Integer.parseInt(num);
        System.out.println(sum);
        System.out.println(number);
    }
}
