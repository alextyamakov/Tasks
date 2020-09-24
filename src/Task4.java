import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите бинарное число: ");
        String bin_num = in.nextLine();
        int int_num = Integer.parseInt(bin_num, 2);
        System.out.println(int_num);
    }
}
