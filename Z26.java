//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
//        (Таблицу ASCII).
package by.epam.jb29.task03;

public class Z26 {
    public static void main(String[] args) {

        for (int i = 1; i < Math.pow(2, 16) - 1; i++) {
            System.out.println(i + " = " + (char)i);
        }
    }
}
