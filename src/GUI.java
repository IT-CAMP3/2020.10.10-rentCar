import java.util.Scanner;

public class GUI {
    private static Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        showMainMenu();

        switch (scanner.nextLine()) {
            case "1":
                showCarsList();
                mainMenu();
                break;
            case "2":
                showBusesList();
                mainMenu();
                break;
            case "3":
                showVehiclesList();
                mainMenu();
                break;
            case "4":
                showRentCar();
                mainMenu();
                break;
            case "5":
                break;
            default:
                System.out.println("Nieprawidłowy wybór !!");
        }
    }

    private static void showMainMenu() {
        System.out.println("1. Lista osobowych");
        System.out.println("2. Lista busów");
        System.out.println("3. Wszystkie");
        System.out.println("4. Wypożycz");
        System.out.println("5. Exit");
    }

    private static void showCarsList() {
        for(Car currentCar : DataBase.getInstance().getCars()) {
            System.out.println(currentCar);
        }
        System.out.println();
    }

    private static void showBusesList() {
        for(Bus currentBus : DataBase.getInstance().getBuses()) {
            System.out.println(currentBus);
        }
        System.out.println();
    }

    private static void showVehiclesList() {
        for(Vehicle currentVehicle : DataBase.getInstance().getVehicles()) {
            System.out.println(currentVehicle);
        }
        System.out.println();
    }

    private static void showRentCar() {
        System.out.println("Podaj nr rejestracyjny:");
        String plate = scanner.nextLine();
        boolean result = DataBase.getInstance().rentVehicle(plate);
        if(result) {
            System.out.println("Udało się !!");
        } else {
            System.out.println("Wypożyczenie nie udane ! Spróbuj jeszcze raz !");
        }
        System.out.println();
    }
}
