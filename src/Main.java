import java.util.Scanner; // импорт сканера
/*Числа подряд. Дана следующая сигнатура метода:

public static String listNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от 0
 до x (включительно).

Пример:
x=5
результат: “0 1 2 3 4 5”
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + listNums(5));
    }
    public static String listNums(int x)
    { String s="";
        for (int i=1; i<=x;i++)
        {
            s += i;
            if (i<x ) {s += " ";}
        }
        return s;
    }
}