import java.util.Scanner;

public class FibonacciRecursive {

    static void printFibonacci(int n, int a, int b) {
        if (n <= 0) {
            return;
        }

        int next = a + b;
        System.out.print(next + " ");

        printFibonacci(n - 1, b, next);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sınırlayıcı sayı giriniz: ");
        int i = input.nextInt();

        int first = 0, second = 1;

        if (i >= 1) {
            System.out.print(first + " ");
        }
        if (i >= 2) {
            System.out.print(second + " ");
        }

        printFibonacci(i - 2, first, second);

        input.close();
    }
}
