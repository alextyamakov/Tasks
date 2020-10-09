import java.io.*;

public class Task16 {
    public static void main(String[] args) {
        String str;
        try (BufferedReader br = new BufferedReader (new FileReader("test.txt")))
        {
            while ((str = br.readLine()) !=null) {
                System.out.println(str);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc.getMessage());
        }
    }
}

