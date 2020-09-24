import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = in.nextInt();
        System.out.println("Введите число y: ");
        double y = in.nextInt();
        System.out.println("Введите число z:");
        double z = in.nextInt();
        double mean = (x + y + z) / 3;
        System.out.println("Среднее арифметическое - " + mean);
        int half_mean = (int) (mean / 2);
        if (half_mean > 3) {
            System.out.println("Программа выполнена корректно");

        }
    }
}
