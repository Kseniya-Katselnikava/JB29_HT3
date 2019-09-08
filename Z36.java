//Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.
package by.epam.jb29.task03;

public class Z36 {
    public static void main(String[] args) {
        int a, b, digit, proizv;
        for (a = 10; a <=99; a++){
            for (b = 10; b <=99; b++){
               proizv = a * b;
               digit = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
               if (digit % proizv == 0){
                   System.out.println("Число а равно: " + a + " Число b равно: " + b);
               }
            }
        }
    }
}
