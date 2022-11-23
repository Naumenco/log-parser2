import java.util.Scanner; // импорт сканера
/* Делитель. Дана следующая сигнатура метода:

public static boolean isDivisor (int a, int b);
Необходимо реализовать метод таким образом, чтобы он возвращал true если любое из принятых чисел делит другое нацело.

Пример 1:
a=3 b=6
результат: true
Пример 2:
a=2 b=15
результат: false
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);

        System.out.println("результат:" + isDivisor(96, 16));
    }
    public static boolean isDivisor (int a, int b)
    {
       // System.out.println(a%b);
       // System.out.println(b%a);
        if ((a%b==0) || (b%a==0)) {return true;};
        return false;
    }
}