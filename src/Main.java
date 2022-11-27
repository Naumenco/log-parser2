import java.util.Scanner; // импорт сканера
/* Тройной максимум. Дана следующая сигнатура метода:

public static int max3(int x, int y, int z);
Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел.
 Подсказка: идеальное решение включает всего две инструкции if и не содержит вложенных if.

Пример 1:
x=5  y=7  z=7
результат: 7
Пример 2:
x=8  y=-1   z=4
результат: 8
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("результат: " + max3(-3, -7,-15));
    }
    public static int max3(int x, int y, int z)
    {
        if ((x>y)&&(x>z)) {return x;}
        if ((y>x)&&(y>z))  {return y;}
        return z;
    }
}