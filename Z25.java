//Требуется определить факториал числа, которое ввел пользователь
package by.epam.jb29.task03;
import java.util.Scanner;

public class Z25 {
    public static void main(String[] args) {
        for (int x = 0; x <= (int) (Math.pow(2, 16) - 1); x++) {
            char ch = (char) x;
            System.out.println("Числовое значение: " + x + "\tСимвольное значение: " + ch);
        }
    }
}