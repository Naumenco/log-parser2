import java.util.Scanner; // импорт сканера
/*Букву в число. Дана следующая сигнатура метода:

public static int charToNum(char x);
Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”. Необходимо реализовать метод таким
образом, чтобы он преобразовывал символ в соответствующее число. Подсказка: код символа ‘0’ — это число 48.
 */
public class Main {
    public static void main(String[] args) {
       // System.out.println("Введите целое число (знаков в числе 1): ");
       // Scanner reader = new Scanner(System.in);
       // char charNumber = reader.next().charAt(0);

        char myNum= '0';
        System.out.println(charToNum(myNum));
        }
    public static int charToNum(char x)
    {
        char myChar = (char) x;
        return myChar;
    }
}