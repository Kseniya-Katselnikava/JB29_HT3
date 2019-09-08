//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
package by.epam.jb29.task03;

public class Z16 {
    public static void main(String[] args) {
        long proizv = 1;
        int sum = 1;
        int a = 2;
        for (int x = a; x <= 10; x++){
            sum = sum + x;
            proizv = proizv* sum;
//            System.out.println(sum + " " + proizv);
        }
        System.out.println(proizv);
    }
}
