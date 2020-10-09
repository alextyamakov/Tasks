import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + "-й элемент массива: ");
            int var = in.nextInt();
            A[i] = var;
        }
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
        }
        String B = Arrays.toString(A);
        System.out.print(B);
    }
}
