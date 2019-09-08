//Необходимо вывести на экран таблицу умножения на 3:
package by.epam.jb29.task03;

public class Z3 {
    public static void main(String[] args) {
        final int A = 3;
        int a = 1;
        int res;
        while (a <= 9){
            res = A * a;
            System.out.println(A + " * " + a + " = " + res);
            a += 1;
        }
    }
}
