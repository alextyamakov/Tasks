import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");
        int num = in.nextInt();
        String row1 = (num > 0) ? "1 2 3 4 5 6 7 8 9 10\n": "";
        System.out.print(row1);
        String row2 = (num > 1) ? "2 4 6 8 10 12 14 16 18 20\n": "";
        System.out.print(row2);
        String row3 = (num > 2) ? "3 6 9 12 15 18 21 24 27 30\n": "";
        System.out.print(row3);
        String row4 = (num > 3) ? "4 8 12 16 20 24 28 32 36 40\n": "";
        System.out.print(row4);
        String row5 = (num > 4) ? "5 10 15 20 25 30 35 40 45 50\n": "";
        System.out.print(row5);
        String row6 = (num > 5) ? "6 12 18 24 30 36 42 48 54 60\n": "";
        System.out.print(row6);
        String row7 = (num > 6) ? "7 14 21 28 35 42 49 56 63 70\n": "";
        System.out.print(row7);
        String row8 = (num > 7) ? "8 16 24 32 40 48 56 64 72 80\n": "";
        System.out.print(row8);
        String row9 = (num > 8) ? "9 18 27 36 45 54 63 72 81 90\n": "";
        System.out.print(row9);
        String row10 = (num > 9) ? "10 20 30 40 50 60 70 80 90 100\n": "";
        System.out.print(row10);
        String row11 = (num > 10) ? "введено число больше 10": "";
        System.out.print(row11);
    }

}