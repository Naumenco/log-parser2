import java.util.Scanner; // импорт сканера
/* Угадайка. Дан следующий метод:

    public static void guessGame() {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("What number am I thinking (0 to 9)? :");
        int x = sc.nextInt();
        if (x != randomNum) {
            System.out.println("No, try again");
        } else {
            System.out.println("Yes, it`s " + randomNum);
        }
    }
Данный метод считывает с консоли введенное пользователем число и выводит, угадал ли пользователь то, что было загадано, или нет. Перепишите этот метод таким образом, чтобы он запускался до тех пор, пока пользователь не угадает число. После этого выведите на экран количество попыток, которое потребовалось пользователю, чтобы угадать число.

Ответом на задание является измененный метод.
 */
public class Main {
    public static void main(String[] args) {
        guessGame();
    }

    public static void guessGame() {
        int randomNum = 3;
        int x;
        int count = 0;
        do {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            count++;
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
            }
        } while (x != randomNum);
        System.out.println("You spend " + count + " tries!");
    }

}