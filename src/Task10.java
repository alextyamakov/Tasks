import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк в таблице: ");
        int row = in.nextInt();
        System.out.println("Введите кол-во столбцов в таблице: ");
        int column = in.nextInt();
        int table[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Введите " + (j + 1) + "-й элемент таблицы в " + (i + 1) + "-й строке");
                int var = in.nextInt();
                table[i][j] = var;
            }
        }
            for (int j = 0; j < column; j++) {
                System.out.print(" " + (table[0][j] * 3) + " ");
            }
    }
}