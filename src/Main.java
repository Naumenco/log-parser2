import java.util.Scanner; // импорт сканера
/*Букву в число. Дана следующая сигнатура метода:

public static int charToNum(char x);
Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”. Необходимо реализовать метод таким
образом, чтобы он преобразовывал символ в соответствующее число. Подсказка: код символа ‘0’ — это число 48.
 */
public class Main {
    public static void main(String[] args) {

        char myNum= '3';
        System.out.println(charToNum(myNum));
        }
    public static int charToNum(char x)
    {
        return (int) x - 48;
    }
}