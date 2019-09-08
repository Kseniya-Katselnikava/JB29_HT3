//Вычислить значения функции на отрезке [а,b] c шагом h:
package by.epam.jb29.task03;

public class Z8 {
    public static void main(String[] args) {
        double a = -5;
        double b = 40;
        double h = 1;
        double y;
        double c = 6;

        for (double x = a; x <= b; x++){
            if (x == 15){
                y = (x + c)* 2;
                System.out.println("x = " + x + "; y = " + y);
            }
            else {
                y = (x - c)* 6;
                System.out.println("x = " + x + "; y = " + y);
            }
        }
    }

}
