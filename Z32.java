//Проверить введенную пользователем строку на наличие недопустимых символов. В качестве первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
package by.epam.jb29.task03;

public class Z32 {
    public static void main(String[] args) {
        String test = "_dsff/*dsfdf";
        boolean flag = false;
        boolean flag2 = true;

        for (int x = 65; x <= 122; x++) {
            if (test.charAt(0) == (char) x && x <= 90 || test.charAt(0) == (char) x && x == 95 || test.charAt(0) == (char) x && x >= 97) {
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Первый символ может быть только буквой или знаком подчеркивания");
        }

        for (int i = 1; i < test.length(); i++) {

            if (!(test.charAt(i) >= '0' && test.charAt(i) <= '9'
                    || test.charAt(i) >= 'a' && test.charAt(i) <= 'z'
                    || test.charAt(i) >= 'A' && test.charAt(i) <= 'Z' || test.charAt(i) == '_')) {
                flag2 = false;
            }
        }

        if (!flag2) {
            System.out.println("Символы, начиная со второго, могуг быть ТОЛЬКО буквами, цифрами или знаком подчеркивания");
        }

        if (flag && flag2) {
            System.out.println("Строка введена верно");
        } else {
            System.out.println("Строка введена неверно");
        }
    }
}
