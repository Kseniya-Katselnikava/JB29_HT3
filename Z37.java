//Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа: первое число получили путем написания сначала числа А, затем В. Для получения второго числа сначала записали число В, затем А. Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.
package by.epam.jb29.task03;

public class Z37 {
    public static void main(String[] args) {
        int A, B, digitA, digitB;
        for (A = 10; A <=99; A++){
            for (B = 10; B <=99; B++){
                digitA = Integer.parseInt(Integer.toString(A) + Integer.toString(B));
                if (digitA % 99 == 0){
                    digitB = Integer.parseInt(Integer.toString(B) + Integer.toString(A));
                    if (digitB % 49 == 0)
                    System.out.println("Число а равно: " + A + " Число b равно: " + B);
                }
            }
        }
    }
}
