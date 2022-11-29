import java.util.Scanner; // импорт сканера
/* Числа наоборот. Дана следующая сигнатура метода:

public static String reverseListNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от x до 0 (включительно).

Пример:
x=5
результат: “5 4 3 2 1 0”
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + listNums(5));

    }
    public static String listNums(int x)
    { String s="";
        for (int i=x; i>=0;i--)
        {

            if (i<x ) {s += " ";}
            s += i;
        }
        return s;
    }
}