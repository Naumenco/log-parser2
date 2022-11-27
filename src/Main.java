import java.util.Scanner; // импорт сканера
/* День недели. Дана следующая сигнатура метода:

public static String day(int x);
Метод принимает число x, обозначающее день недели. Необходимо реализовать метод таким образом,
чтобы он возвращал строку, которая будет обозначать текущий день недели,
где 1- это понедельник, а 7 – воскресенье. Если число не от 1 до 7 то верните текст “это не день недели”.
 Вместо if в данной задаче используйте switch.

Пример:
x=5
результат: “пятница”
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + day(0));
    }
    public static String day(int x)
    { String weekday="это не день недели";
        switch (x) {
            case 1:
                weekday="понедельник";
                break;
            case 2:
                weekday="вторник";
                break;
            case 3:
                weekday="среда";
                break;
            case 4:
                weekday="четверг";
                break;
            case 5:
                weekday="пятница";
                break;
            case 6:
                weekday="суббота";
                break;
            case 7:
                weekday="воскресенье";
                break;}
        return weekday;
    }
}