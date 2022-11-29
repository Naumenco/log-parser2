import java.io.File;
import java.util.Scanner; // импорт сканера
public class Main {
    public static void main(String[] args) {
        boolean allok =false;
        int count=1;
        do {

            System.out.println("Введите путь к лог-файлу: ");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (!fileExists) System.out.println("Ошибка: файл не найден");
            if (isDirectory) System.out.println("Ошибка: Указан путь до папки");
            if (fileExists&&!isDirectory)
            {
                System.out.println("Это файл номер N="+count);
                count++;
            }
        }  while (true);

        }
}
