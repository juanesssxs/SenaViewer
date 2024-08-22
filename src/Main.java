import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {

            System.out.println("Sena Viewer Menu:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("7. Exit");
            System.out.print("Please select an option (1-7): ");


            option = scanner.nextInt();
            scanner.nextLine(); //


            switch (option) {
                case 1:
                    handleMoviesMenu();
                    break;
                case 2:
                    handleSeriesMenu();
                    break;
                case 3:
                    handleBooksMenu();
                    break;
                case 4:
                    handleMagazinesMenu();
                    break;
                case 5:
                    System.out.println("You selected Report.");

                    break;
                case 6:
                    System.out.println("You selected Report Today.");

                    break;
                case 7:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 7.");
            }

            System.out.println();

        } while (option != 7);

        scanner.close();
    }
    private static void handleChaptersMenu() {
        int option;
        do {
            System.out.println("Chapters Menu:");
            System.out.println("1. Add Chapters");
            System.out.println("2. View Chapters");
            System.out.println("3. Back to Main Menu");
            System.out.print("Please select an option (1-3): ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Add a new Chapters:");

                    break;
                case 2:
                    System.out.println("View Chapters:");

                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 3.");
            }

            System.out.println();

        } while (option != 3);
    }

    private static void handleMoviesMenu() {
        int option;
        do {
            System.out.println("Movies Menu:");
            System.out.println("1. Add Movie");
            System.out.println("2. View Movies");
            System.out.println("3. Back to Main Menu");
            System.out.print("Please select an option (1-3): ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Add a new chapter:");

                    break;
                case 2:
                    System.out.println("View chapter:");

                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 3.");
            }

            System.out.println();

        } while (option != 3);
    }

    private static void handleSeriesMenu() {
        int option;
        do {
            System.out.println("Series Menu:");
            System.out.println("1. Add Series");
            System.out.println("2. View Series");
            System.out.println("3. Back to Main Menu");
            System.out.print("Please select an option (1-3):");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Add a new series:");

                    break;
                case 2:
                    System.out.println("View series:");

                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 3.");
            }

            System.out.println();

        } while (option != 3);
    }

    private static void handleBooksMenu() {
        int option;
        do {
            System.out.println("Books Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Back to Main Menu");
            System.out.print("Please select an option (1-3): ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Add a new book:");

                    break;
                case 2:
                    System.out.println("View books:");

                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 3.");
            }

            System.out.println();

        } while (option != 3);
    }

    private static void handleMagazinesMenu() {
        int option;
        do {
            System.out.println("Magazines Menu:");
            System.out.println("1. Add Magazine");
            System.out.println("2. View Magazines");
            System.out.println("3. Back to Main Menu");
            System.out.print("Please select an option (1-3): ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Add a new magazine:");

                    break;
                case 2:
                    System.out.println("View magazines:");

                    break;
                case 3:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a number between 1 and 3.");
            }

            System.out.println();

        } while (option != 3);
    }
}
