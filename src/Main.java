import java.util.Scanner; // импорт сканера
/* Тройная сумма. Дана следующая сигнатура метода:

public static boolean sum3(int x, int y, int z);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если два любых числа (из трех принятых) можно сложить так, чтобы получить третье.

Пример 1:
x=5  y=7  z=2
результат: true
Пример 2:
x=8  y=-1   z=4
результат: false
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("результат: " + sum3(5, 7,2));
    }
    public static boolean sum3(int x, int y, int z)
    {
        if ((x+y==z) || (x+z==y) || (y+z==z)) {return true;}
        return false;
    }
}