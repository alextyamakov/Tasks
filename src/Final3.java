import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс: ");
        double rate = in.nextDouble();
        System.out.println("Введите количество рублей: ");
        double amount = in.nextDouble();
        double value = Math.round((amount / rate) * Math.pow(10, 2)) / Math.pow(10, 2);
        System.out.println(value);
    }
}
