//Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их угадать.
//        Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала программа, а также
//        ошибочные числа пользователя.
package by.epam.jb29.task03;
import java.util.Random;
import java.util.Scanner;

public class Z31 {
    public static void main(String[] args) {
        Random ran = new Random();
        int arr [] = new int[5];
        int inp [] = new int[5];

        for (int x = 0; x < arr.length; x++) {
            arr [x] = ran.nextInt(15);
            System.out.print(arr[x] + "\t");
        }
        System.out.println();
        for (int x = 0; x < inp.length; x++) {
            System.out.println("Введите " + (x + 1) + " число:");
            inp [x] = input();
          }
        System.out.println("Угаданные числа: ");
        for (int x = 0; x < arr.length; x++){

            for (int y = 0; y < inp.length; y++){
                if (arr[x] == inp[y]){
                    System.out.print(arr[x] + "\t");
                }
            }
        }
        System.out.println("\nНе угаданные числа пользователя: ");
        for (int x = 0; x < arr.length; x++){
            boolean flag = false;

            for (int y = 0; y < inp.length; y++){
                if (arr[x] == inp[y]){
                    flag = false;
                    break;
               }
                else {
                    flag = true;
                }
            }
            if (flag){
                System.out.print(arr[x] + "\t");
            }
        }

        System.out.println("\nОшибочные числа пользователя: ");
        for (int y = 0; y < inp.length; y++){
            boolean flag = false;

            for (int x = 0; x < arr.length; x++){
                if (arr[x] == inp[y]){
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
            if (flag){
                System.out.print(inp[y] + "\t");
            }
        }
    }
    public static int input (){
        Scanner sc = new Scanner(System.in);
        int input;
        while (!sc.hasNextInt()){
            sc.next();
        }
//        System.out.println("Enter number:");
        input = sc.nextInt();
    return input;
    }
}
