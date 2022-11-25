import java.util.Scanner; // импорт сканера
/* Максимум. Дана следующая сигнатура метода:

public static int max(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал максимальное значение из двух полученных
 методом чисел.

Пример 1:
x=5  y=7
результат: 7
Пример 2:
x=8  y=-1
результат: 8
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("результат:" + max(27,200));
    }
    public static int max(int x, int y)
    {
        if (x>=y) {return x;};
        return y;
    }
}