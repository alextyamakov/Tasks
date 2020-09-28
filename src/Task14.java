import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите переменную: ");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.print(S + "\n" + X + "\n" + Y);
    }
}