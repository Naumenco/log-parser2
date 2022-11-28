import java.util.Scanner; // импорт сканера
/* Длина числа. Дана следующая сигнатура метода:

public static int numLen(long x);
Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x.

Подсказка:
int у=123/10; // у будет иметь значение 12
Пример:
x=12567
результат: 5
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + numLen(2232343));
    }
    public static int numLen(long x)
    { int c=0;
        for (; x>0;x/=10)
        {
           c++;
        }
        return c;
    }
}