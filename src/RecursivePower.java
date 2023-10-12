import java.util.Scanner;

public class RecursivePower {

    static void power(int i, int j){
        // answer = i^ j
        int sonuc = 1;

        for (int k = 0; k < j; k++) {
            sonuc *= i;
        }

        System.out.println(i + " üzeri " + j + " = " + sonuc);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz: " );
        int us = input.nextInt();
        power(taban,us);
    }
}
