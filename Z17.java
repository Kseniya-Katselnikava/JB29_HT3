//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)
package by.epam.jb29.task03;

public class Z17 {
    public static void main(String[] args) {
        double a = 5;
        int n = 35;
        double proizv = 1;

        for (double x = 0; x <= n - 1; x++){
           proizv = proizv * (a + x);
        }
        System.out.println(proizv);
    }
}
