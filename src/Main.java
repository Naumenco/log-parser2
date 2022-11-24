import java.util.Scanner; // импорт сканера
/* Есть ли позитив. Дана следующая сигнатура метода:

public static boolean isPositive(int x);
        Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно положительное.

        Пример 1:
        x=3
        результат: true
        Пример 2:
        x=-5
        результат: false
 */
public class Main {
    public static void main(String[] args) {
       // System.out.println("Введите целое число (знаков в числе 1): ");
       // Scanner reader = new Scanner(System.in);
       // char charNumber = reader.next().charAt(0);

        int myNum= 10;
        System.out.println("результат: "+isPositive(myNum));
        }

    public static boolean isPositive(int x)
    {
        return x>0;
    }
}