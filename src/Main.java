import java.util.Scanner; // импорт сканера
/* Диапазон. Дана следующая сигнатура метода:

public static boolean isInRange(int a, int b, int num);
Метод принимает левую и правую границу (a и b) некоторого числового диапазона.
Необходимо реализовать метод таким образом, чтобы он возвращал true, если num входит в указанный диапазон (включая границы).
Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а кто меньше)

Пример 1:
a=5 b=1 num=3
результат: true
Пример 2:
a=2 b=15 num=33
результат: false
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);

        System.out.println("результат:" + isInRange(2, 15, 14));
    }
    public static boolean isInRange(int a, int b, int num)
    {
        //System.out.println(a-b);
        if ((a > b) && (a-b)>=num){return true;};
        if ((a < b) && (b-a)>=num){return true;};
        return false;
    }
}