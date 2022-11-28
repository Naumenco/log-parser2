import java.util.Scanner; // импорт сканера
/* Вывод дней недели. Дана следующая сигнатура метода:

public static void printDays(String x);
В качестве параметра метод принимает строку, в которой записано название дня недели. Необходимо реализовать метод таким образом, чтобы он выводил на экран название переданного в него дня и всех последующих до конца недели дней. Если в качестве строки передан не день, то выводится текст “это не день недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной задаче используйте switch.

Пример:
x=”четверг”
результат:
четверг
пятница
суббота
воскресенье
Пример:
x=”чг”
результат:
это не день недели
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: ");
                 printDays("среда");
    }
    public static void printDays(String x)
    {
        switch (x) {
            case "понедельник" :
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");}
        return;
    }
}