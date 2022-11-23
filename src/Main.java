import java.util.Scanner; // импорт сканера
/* Многократный вызов. Дан следующий метод:

public static int lastNumSum(int a, int b){
	return (a%10)+(b%10);
}
Выполните с его помощью сложение пяти чисел: 5, 11, 123, 14, 1, и результат выведите на экран.
Постарайтесь выполнить задачу, используя минимально возможное количество вспомогательных переменных.

Ответом на данное задание является код метода main, в котором происходит вызов данной функции.
 */
public class Main {
    public static void main(String[] args) {
        // System.out.println("Введите целое число (знаков в числе 1): ");
        // Scanner reader = new Scanner(System.in);
        // char charNumber = reader.next().charAt(0);
        int summ1=lastNumSum(5, 11);
        int summ2=lastNumSum(123, 14);
        int summ3=lastNumSum(summ1, summ2);

        System.out.println("результат:" + lastNumSum(summ3 , 1));
    }
    public static int lastNumSum(int a, int b){
        return (a%10)+(b%10);
    }
}