import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Lista osobowych");
        System.out.println("2. Lista busów");
        System.out.println("3. Wszystkie");
        System.out.println("4. Wypożycz");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);

        String choose = scanner.nextLine();

        switch (choose) {
            case "1":
                DataBase db = new DataBase();
                db.vehicles
                break;
            case "2":
                System.out.println("Case 2");
                break;
            case "3":
                System.out.println("Case 3");
                break;
            case "4":
                System.out.println("Case 4");
                break;
            case "5":
                break;
                default:
                    System.out.println("Nieprawidłowy wybór !!");
        }
    }
}
