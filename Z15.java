//Вычислить : 1+2+4+8+...+ 2 в 10 степени.
package by.epam.jb29.task03;

public class Z15 {
    public static void main(String[] args) {
        double sum = 0;
        double step = 0;
        double a = 2;

        while (step <= 10){
            sum = sum + Math.pow(a, step);
            step ++;
        }
        System.out.printf("%.0f", sum);
    }
}
