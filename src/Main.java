import java.util.Scanner; // импорт сканера
/* Модуль числа. Дана следующая сигнатура метода:

public static int abs(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х (если он был положительным,
 то таким и остается, если он был отрицательным – то необходимо вернуть его без знака минус).

Пример 1:
x=5
результат: 5
Пример 2:
x=-3
результат: 3
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);

        System.out.println("результат:" + abs(-3));
    }
    public static int abs(int x)
    {
        //System.out.println(a-b);
        if (x<0){return x*(-1);};
        return x;
    }
}