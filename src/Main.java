import java.util.Scanner; // импорт сканера
/* Одинаковость. Дана следующая сигнатура метода:

public static boolean equalNum(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал true, если все знаки числа одинаковы,
 и false в ином случае.
Подсказки:
int x=123%10; // х будет иметь значение 3
int у=123/10; // у будет иметь значение 12

Пример 1:
x=1111
результат: true
Пример 2:
x=1211
результат: false
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + equalNum(22222));
    }
    public static boolean equalNum(int x)
    { int c=x%10;
         for (; x>0;x/=10)
        {
           if (x%10!=c) { return false;}
        }
        return true;
    }
}