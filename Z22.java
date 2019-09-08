//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//        представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
//        значения функции
package by.epam.jb29.task03;

public class Z22 {
    public static void main(String[] args) {
        double a = -5;
        double b = 20;
        double h = 1;
        double f;

        for (double x = a; x <= b; x++){
            f = Math.toRadians(Math.pow(Math.sin(x), 2));
            System.out.printf("x = %.0f;\t F(x) = %.3f \n", x, f);
        }
    }
}
