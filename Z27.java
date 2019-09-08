//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
//        и самого числа. m и n вводятся с клавиатуры.
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число m:");
        int m = sc.nextInt();
        System.out.println("Введите число n:");
        int n = sc.nextInt();

        for (int x = m; x <=n; x ++){
            System.out.println("\nДелители числа x = " + x + " :");
            for (int y = 2; y < x; y++){
                if (x % y == 0){
                    System.out.print(y + "\t");
                }
            }
        }
    }
}
