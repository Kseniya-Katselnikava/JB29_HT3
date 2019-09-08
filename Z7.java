//Вычислить значения функции на отрезке [а,b] c шагом h:
package by.epam.jb29.task03;

public class Z7 {
    public static void main(String[] args) {
        double a = -5;
        double b = 40;
        double h = 1;
        double y;

        for (double x = a; x <= b; x++){
            if (x > 2){
                y = x;
                System.out.println("x = " + x + "; y = " + y);
            }
            else {
                y = -1 * x;
                System.out.println("x = " + x + "; y = " + y);
            }
        }
    }
}
