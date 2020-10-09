import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите бинарное число: ");
        String bin_num = in.nextLine();
        int[] A = new int[bin_num.length()];
        for ( int i = 0; i < bin_num.length(); i++ ) {
            A[i] = bin_num.charAt(i) - '0';
        }
        int int_num = 0;
        for (int i = 0; i < A.length; i++) {
            int_num += A[i] * Math.pow(2,(A.length - i - 1));
        }
        System.out.println("Десятичный формат: " + int_num);
    }
}
