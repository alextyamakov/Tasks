import java.io.*;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        String str;
        int linecount = 0;
        Scanner in = new Scanner(System.in);
        try (BufferedReader br = new BufferedReader (new FileReader("test.txt")))
        {
            while ((str = br.readLine()) !=null) {
                System.out.println(str);
                linecount++;
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("test.txt")) {
            for (int i = 0; i < linecount; i++) {
                System.out.print("\nВведите " + (i + 1) + "-ую строку: ");
                String var = in.nextLine() + "\n";
                byte[] buffer = var.getBytes();
                fos.write(buffer, 0, buffer.length);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc.getMessage());
        }
    }
}