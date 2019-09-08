//Получить все числа, не превышающие заданного числа N, которые делятся без остатка на все свои цифры.
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int N = sc.nextInt();
        boolean flag = false;

        for (int x = 1; x <= N; x++){
            int y = x;

            while(y != 0) {
                int dig = y % 10;

                if (dig != 0) {
                    if (x % dig == 0) {
                        flag = true;
                        y /= 10;
                    } else {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
//                    System.out.println("Делить на ноль нельзя.");
                    break;
                    }
                }

            if (flag){
                System.out.println(x);
            }
        }
    }
}
