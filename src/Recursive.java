import java.util.Scanner;

public class Recursive {

    static void recursive(int number) {
        System.out.print(number + " ");

        if (number <= 0) {
            return;
        }
        recursive(number-5);
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        recursive(number);
    }
}
