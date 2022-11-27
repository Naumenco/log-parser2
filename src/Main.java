import java.util.Scanner; // импорт сканера
/* Волшебная шестерка. Дана следующая сигнатура метода:

public static boolean magic6(int x, int y);
Необходимо реализовать метод таким образом, чтобы он возвращал true,
если одно из принятых методом чисел равно шести, или их сумма равна шести,
или разница между ними равна шести.

Пример 1:
x=5  y=7
результат: false
Пример 2:
x=8  y=2
результат: true
Пример 3:
x=1  y=6
результат: true
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("результат: " + magic6(8,-2));
    }
    public static boolean magic6(int x, int y)
    {
        if ((x==6) || (y==6) || (x+y==6) || (x-y==6) || (y-x==6)) {return true;}
        return false;
    }
}