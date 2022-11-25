import java.util.Scanner; // импорт сканера
/* Двузначное. Дана следующая сигнатура метода:

public static boolean is2Digits(int x);
Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true если оно двузначное.

Пример 1:
x=32
результат: true
Пример 2:
x=516
результат: false
 */
public class Main {
    public static void main(String[] args) {
       // System.out.println("Введите целое число (знаков в числе 1): ");
       // Scanner reader = new Scanner(System.in);
       // char charNumber = reader.next().charAt(0);

        int myNum= -56;
        System.out.println("результат: "+is2Digits(myNum));
        }

    public static boolean is2Digits(int x)
    {
double xx= (double) x;
        //System.out.println(xx/100);
        if (((xx/100<1)&&(xx/100>0.09))||((xx/100>-1)&&(xx/100<-0.09))){return true;};
        return false;
    }
}