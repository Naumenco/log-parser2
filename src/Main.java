import java.util.Scanner; // импорт сканера
/* Безопасное деление. Дана следующая сигнатура метода:

public static int safeDiv(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал деление x на y,
и при этом гарантировал, что не будет выкинута ошибка деления на 0.
При делении на 0 следует вернуть из метода число 0. Подсказка: смотри ограничения на операции типов данных.

Пример 1:
x=5  y=0
результат: 0
Пример 2:
x=8  y=2
результат: 4
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);

        System.out.println("результат:" + safeDiv(-27,0));
    }
    public static int safeDiv(int x, int y)
    {
        if (y==0) {return 0;};
        return x/y;
    }
}