import java.util.Scanner; // импорт сканера
/* Степень числа. Дана следующая сигнатура метода:

public static int pow(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал результат возведения x в степень y.

Подсказка: для получения степени необходимо умножить единицу на число x, и сделать это y раз, т.е.
 два в третьей степени это 1*2*2*2

Пример:
x=2
y=5
результат: 32
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + pow(2 ,5));
    }
    public static int pow(int x, int y)
    { int s=1;
        for (int i=0; i<y;i++)
        {
            s = s*x;
        }
        return s;
    }
}