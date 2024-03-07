import java.util.Scanner;

public class Main {
    public static void displayFavoriteSport(String sport) {
        System.out.println("Twój ulubiony sport to: " + sport);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jaki jest Twój ulubiony sport? ");
        String sport = scanner.nextLine();
        displayFavoriteSport(sport);
        scanner.close();
    }
}
