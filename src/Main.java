import java.util.Scanner; // импорт сканера
/* Квадрат. Дана следующая сигнатура метода:

public static void square(int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов ‘*’ размером х, у которого
х символов в ряд и х символов в высоту. Подсказка: метод System.out.print выводит без перехода на следующую строку,
в то время как System.out.println выводит с переходом.

Пример 1:
x=2
результат:
**
**
Пример 2:
x=4
результат:
****
****
****
****
 */
public class Main {
    public static void main(String[]  args) {
        square(7);
    }
    public static void square(int x)
    {
        int count=0;
            for (int i=0; i<x*x; i++){
                if (count==x)
                {
                    System.out.println (""); count =0;
                }
            count++;
            System.out.print (" * ");
            }
        }

}

