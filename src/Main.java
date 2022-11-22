import java.util.Scanner; // импорт сканера

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();
        System.out.println("Результат сложения "+firstNumber+" и "+secondNumber+" равно: "+ (firstNumber+secondNumber));
        System.out.println("Результат разницы "+firstNumber+" и "+secondNumber+" равно: "+ (firstNumber-secondNumber));
        System.out.println("Результат произведения "+firstNumber+" и "+secondNumber+" равно: "+ (firstNumber*secondNumber));

        if (secondNumber==0) {System.out.println("Результат деления: на 0 делить нельзя!"); System.exit(0);}
        double quotinent = (double) firstNumber / secondNumber;
        System.out.println("Результат деления "+firstNumber+" на "+secondNumber+" равно: "+ quotinent);
        }
}