//Написать программу, переводящую римские цифры в арабские.
package by.epam.jb29.task03;

public class Z30 {
    public static void main(String[] args) {
        char ch;
        int y = 1;
        int zn = 0;
        int zn2 = 0;

        for (int i = 8544; i < 8560; i++) {
            if (y <= 12) {
                ch = (char) i;
                System.out.println(ch + " = " + y);
            }
            else if (y <= 14) {
                ch = (char) i;
                zn += 50;
                System.out.println(ch + " = " + zn);
            }
            else {
                ch = (char) i;
                zn2 += 500;
                System.out.println(ch + " = " + zn2);
            }
            y ++;
        }
    }
}