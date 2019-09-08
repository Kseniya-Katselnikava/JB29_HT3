//В трехзначном числе зачеркнули старшую цифру. Когда полученное число умножили на 7, то получили исходное число. Найти это число.
package by.epam.jb29.task03;

public class Z39 {
    public static void main(String[] args) {
        int b;
        for (int x = 100; x < 999; x++){
            b = x % 100;
//            System.out.println(b);
            if (b * 7 == x){
                System.out.println(x);
            }
        }

    }
}
