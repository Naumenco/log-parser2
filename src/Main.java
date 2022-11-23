import java.util.Scanner; // импорт сканера
/* Равенство. Дана следующая сигнатура метода:

public static boolean isEqual (int a, int b, int с);
Необходимо реализовать метод таким образом, чтобы он возвращал true если все три полученных методом числа
равны

Пример 1:
a=3 b=3 с=3
результат: true
Пример 2:
a=2 b=15 с=2
результат: false
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);

        System.out.println("результат:" + isEqual(0, 0, 0));
    }
    public static boolean isEqual (int a, int b, int с)
    {
       // System.out.println(a%b);
       // System.out.println(b%a);
        if ((a==b)&& (b==с)) {return true;};
        return false;
    }
}