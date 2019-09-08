//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5.
package by.epam.jb29.task03;

public class Z13 {
    public static void main(String[] args) {
        double x, y;
        x = -5;
        while (x <= 5) {
            y = 5 - (Math.pow(x, 2))/2;
            x += 0.5;
            System.out.printf("x = %.1f; \t y = %.3f \n", x , y );
        }
    }
}
