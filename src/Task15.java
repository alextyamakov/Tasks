import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int A[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
            int var = in.nextInt();
            A[i] = var;
        }
        for (int i = A.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (A[j] > A[j + 1]) {
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
        String B = Arrays.toString(A);
        System.out.print(B);
    }
}