import java.util.Scanner;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int i;
        int sample[] = new int[size];
        for (i = 0; i < size; i = i+1) {
            System.out.println("Введите элемент массива " + i + " (число): ");
            int var = in.nextInt();
            sample[i] = (var*2);
        }
        String samplestring = Arrays.toString(sample);
        System.out.print(samplestring);
    }
}