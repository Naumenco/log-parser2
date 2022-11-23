import java.util.Scanner; // импорт сканера
/* Большая буква. Дана следующая сигнатура метода:

public static boolean isUpperCase(char x);
Необходимо реализовать метод таким образом, чтобы он принимал символ x и возвращал true если это большая буква в диапазоне от ‘A’ до ‘Z’.

Пример 1:
x=’D’
результат: true
Пример 2:
x=’q’
результат: false
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);

        char myChar= 'D';
        System.out.println(isUpperCase(myChar));
    }
    public static boolean isUpperCase(char x)
    {
        int myNum = (int) x;
        System.out.println(myNum);
        if ((myNum>=65&&myNum<=90)){return true;};
        return false;
    }
}