//Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
//        результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а также
//        на ввод Y=0 при делении. Организовать возможность многократных вычислений без перезагрузки программа
//        (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z28 {
    public static void main(String[] args) {
        int exit, X, Y;
        String znak;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Если хотите выйти, то нажмите 0. Хотите выйти?");
            exit = sc.nextInt();
            if (exit != 0) {
                System.out.println("Введите Х:");
                X = sc.nextInt();
                System.out.println("Введите Y:");
                Y = sc.nextInt();

                Scanner sc1 = new Scanner(System.in);
                 System.out.println("Введите знак операци: +, -, /, *");
                 znak = sc1.nextLine();
                 char zn = znak.charAt(0);

                    switch (zn) {
                        case '+':
                            int sum = X + Y;
                            System.out.println(X + " " + zn + " " + Y + " = " + sum);
                            break;
                        case '-':
                            int raz = X - Y;
                            System.out.println(X + " " + zn + " " + Y + " = " + raz);
                            break;
                        case '*':
                            int proizv = X * Y;
                            System.out.println(X + " " + zn + " " + Y + " = " + proizv);
                            break;
                        case '/':
                            if (Y != 0) {
                                double del = (double) X / Y;
                                System.out.println(X + " " + zn + " " + Y + " = " + del);
                                break;
                            }
                            else {
                                System.out.println("Делить на ноль нельзя.");
                                break;
                            }
                    }
            }else {
                break;
            }
        } while (exit != 0);

    }
}
