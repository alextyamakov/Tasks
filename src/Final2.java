import java.util.Arrays;
import java.util.Scanner;

public class Final2{
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
        for (int i = 0; i < A.length; i++) { //сортировка вставками
            int temp = A[i];
            int j = i;
            while (j > 0 && A[j - 1] > temp) {
                A[j] = A[j - 1];
                j--;
                A[j] = temp;
            }
        }
        System.out.println(Arrays.toString(A));
    }
}