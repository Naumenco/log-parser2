import java.util.Scanner; // импорт сканера
/*Сумма знаков. Дана следующая сигнатура метода:

public static int sumLastNums(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал результат сложения двух последних знаков числа х,
предполагая, что знаков в числе не менее двух.

Подсказки:

    int x=123%10; // х будет иметь значение 3
    int у=123/10; // у будет иметь значение 12
Пример:
    x=4568
    результат: 14
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое число (знаков в числе не менее двух): ");
        int intNumber = new Scanner(System.in).nextInt();
        System.out.println(sumLastNums(intNumber));
        }
    public static int sumLastNums(int x)
    {
        int firstRight = x%10;
        int secondRight = (x%100-x%10)/10;
            return firstRight+secondRight;
    }
}