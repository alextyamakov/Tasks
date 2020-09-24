import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк в таблице: ");
        int row = in.nextInt();
        System.out.println("Введите кол-во столбцов в таблице: ");
        int column = in.nextInt();
        int i, j;
        int table[][] = new int[row][column];
        for (i = 0; i < row; i = i + 1) {
            for (j = 0; j < column; j = j + 1) {
                System.out.println("Введите " +(j+1)+ "-й элемент таблицы в " +(i+1)+ "-й строке");
                int var = in.nextInt();
                table[i][j] = (var);
            }
        }
        for (i = 0; i == 0; i++) {
            for (j = 0; j < column; j = j+1) {
                System.out.print(" " + (table[i][j]*3) + " ");
            }
        }
    }
}