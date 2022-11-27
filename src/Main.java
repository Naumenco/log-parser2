import java.util.Scanner; // импорт сканера
/* Двойная сумма. Дана следующая сигнатура метода:

public static int sum2(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал сумму чисел x и y.
Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть число 20.

Пример 1:
x=5  y=7
результат: 20
Пример 2:
x=8  y=-1
результат: 7
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("результат: " + sum2(8, -1));
    }
    public static int sum2(int x, int y)
    {
        if ((x+y>=10) && (x+y<=19)) {return 20;}
        return x+y;
    }
}