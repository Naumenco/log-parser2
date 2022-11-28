import java.util.Scanner; // импорт сканера
/* Четные числа. Дана следующая сигнатура метода:

public static String chet(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все
 четные числа от 0 до x (включительно). Подсказа для обеспечения качества кода:
 инструкцию if использовать не следует.

Пример:
x=9
результат: “0 2 4 6 8”
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + chet(50));
    }
    public static String chet(int x)
    { String s="";
        for (int i=0; i<=x;i+=2)
        {
            s += i+" ";
        }
        return s;
    }
}