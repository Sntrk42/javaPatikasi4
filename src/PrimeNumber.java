import java.util.Scanner;

public class PrimeNumber {

    static void prime(int number){
        boolean prime = true;

        // Sayının bölenlerini kontrol et
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                System.out.println(number + " Sayısı asal değildir!");
                break; // Sayı bölene bölünebilirse asal değildir.
            }
        }
        if (prime){
            System.out.println(number + " Sayısı asaldır!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        prime(number);

    }
}
