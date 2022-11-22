import java.util.Scanner; // импорт сканера
/*Дробная часть. Дана следующая сигнатура метода:
public static double fraction(double x);
        Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х.
        Подсказка: вещественное число может быть преобразовано к целому путем отбрасывания дробной части.
        Пример:
        x=5,3
        результат: 0,3 */
public class Main {
    public static void main(String[] args) {
        //System.out.println("Введите вещественное число (разделитель запятая): ");
        //float floatNumber = new Scanner(System.in).nextFloat();
        //double Number= 5.8;
        System.out.println(fraction(7.7));
        System.out.println(fraction(8));
        System.out.println(fraction(0.5));
        }
    public static double fraction(double x)
    {  int res=(int) x;
            return x-res;
    }
}