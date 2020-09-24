import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int X = 1;
        int Y = 5;
        int Z = 7;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}