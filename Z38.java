//Для заданного натурального числа определить, образуют ли его цифры арифметическую прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
package by.epam.jb29.task03;

public class Z38 {
        public static void main(String[] args) {
            int a = 963;
            int dig = 0, razn = 0, count = 0, buf = 0;
            boolean flag = false, flag2 = false;

            while (count < 2) {
                dig = a % 10;

                if (count == 0) {
                    razn = dig;
                }
                else {
                    if (razn < dig) {
                        razn = dig - razn;
                        flag = true;
                    }
                    else {
                        razn = razn - dig;
                    }
                }
                a /= 10;
                count++;
            }

           while (a != 0) {
                buf = a % 10;
               if (!flag) {
                   if ((dig - razn) == buf) {
                       flag2 = true;
                   }else {
                       flag2 = false;
                       break;
                   }
                }
               else {
                   if ((razn + dig) == buf) {
                       flag2 = true;
                   }else {
                       flag2 = false;
                       break;
                   }
                   a /= 10;
               }
               dig = buf;
               a /= 10;
               }

           if (flag2) {
               System.out.println("Цифры образуют арифметическую прогрессию");
           }
           else {
               System.out.println("Цифры не образуют арифметическую прогрессию");
           }
        }
 }


