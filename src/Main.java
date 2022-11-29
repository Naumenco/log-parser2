import java.util.Scanner; // импорт сканера
/* Правый треугольник. Дана следующая сигнатура метода:

public static void rightTriangle(int x);
Необходимо реализовать метод таким образом, чтобы он выводил на экран треугольник из символов ‘*’ у
которого х символов в высоту, а количество символов в ряду совпадает с номером строки,
при этом треугольник выровнен по правому краю.
1Подсказка: перед символами ‘*’ следует выводить необходимое количество пробелов.

Пример 1:
x=3
результат:
    *
  **
***
Пример 2:
x=4
результат:
      *
    **
  ***
****
 */
public class Main {
    public static void main(String[] args) {
        rightTriangle(4);
    }
    public static void rightTriangle(int x)
    {
       for (int i = 1; i <= x; i++) {
            for (int sp = 1; sp <= x - i; sp++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

