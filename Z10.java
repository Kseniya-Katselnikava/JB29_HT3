//Составить программу нахождения произведения квадратов первых двухсот чисел.
package by.epam.jb29.task03;

import java.math.BigInteger;

public class Z10 {
    public static void main(String[] args) {
        int a = 1;
        long pr = 1;
        while (a <= 200) {
            pr *= Math.pow(a, 2);
            System.out.println(pr);
            a += 1;
        }
        System.out.println(pr);
    }
}
