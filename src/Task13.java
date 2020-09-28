import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строковую переменную: ");
        String stringinput1 = in.nextLine();
        int length1 = stringinput1.length();
        System.out.println("Введите вторую строковую переменную: ");
        String stringinput2 = in.nextLine();
        int length2 = stringinput2.length();
        if (length1 > length2) {
            System.out.println(stringinput1);
        }
        else if (length2 > length1) {
            System.out.println(stringinput2);
        }
        else {
            System.out.println("Длины обеих переменных равны!!!");
        }
    }
}