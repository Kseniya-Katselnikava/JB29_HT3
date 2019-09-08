//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//        заданному е. Общий член ряда имеет вид
package by.epam.jb29.task03;

public class Z20 {
    public static void main(String[] args) {
        double a, n = 1, e = 0.002, sum = 0;
        for (double x = n; x < 20; x++){
            a = 1 / ((3 * x - 2) * (3 * n + 1));
            double b = Math.abs(a);
//            System.out.println(a);
            if (b == e || b > e){
                sum = sum + a;
//                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
