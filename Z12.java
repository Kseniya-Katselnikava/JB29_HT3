//Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения произведения первых 10 членов этой последовательности.
package by.epam.jb29.task03;

public class Z12 {
    public static void main(String[] args) {
        int a = 1;
        int n = 1;
        while (n  >= 1 && n <=10){
            a = 6 + a;
            System.out.println(a);
            n++;
        }
    }
}
