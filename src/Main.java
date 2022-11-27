import java.util.Scanner; // импорт сканера
/* Возраст. Дана следующая сигнатура метода:

public static String age(int x);
Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой сначала будет число х,
 а затем одно из слов:
- год
- лет
Слово “год” добавляется, если число х заканчивается на 1, и “лет” во всех остальных случаях.
Подсказка: оператор % позволяет получить остаток от деления.

Пример 1:
x=5
результат: “5 лет”
Пример 2:
x=31
результат: “31 год”
 */
public class Main {
    public static void main(String[]  args) {
        System.out.println("результат: " + age(72));
    }
    public static String age(int x)
    {
        if (x%10==1) {return Integer.toString (x)+ " год";}
        return Integer.toString (x)+ " лет";
    }
}