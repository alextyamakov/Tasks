import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строковую переменную: ");
        String stringinput = in.nextLine();
        String[] inputArray = stringinput.split(" ");
        String nobreakes = "";
        for (int i = 0; i < inputArray.length; i++) {
            nobreakes = nobreakes.concat(inputArray[i]);
            }
        System.out.println(nobreakes);
        }
    }