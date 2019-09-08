//Составить программу нахождения разности кубов первых двухсот чисел.
package by.epam.jb29.task03;

public class Z11 {
    public static void main(String[] args) {
        int a = 1;
        long raz = 0;
        while (a <= 200) {
            raz -= Math.pow(a, 3);
//            System.out.println(raz);
            a += 1;
        }
        System.out.println(raz);
    }
}
