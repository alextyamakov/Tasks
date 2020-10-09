import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String str;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Для остановки ввода ввести 'stop' c новой строчки");
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc.getMessage());
        }
    }
}
