import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderSystem {
  private ArrayList<Client> clients = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public OrderSystem() {
  }

  public void startSystem() {
    int op = -1;
    while (op != 0) {
      op = mainMenu();
      switch (op) {
        case 1:
          addClient();
          break;
        case 2:
          // add order
          break;
        case 3:
          // change status order
          break;
        case 4:
          // view all clients
          break;
        case 5:
          // view all orders
        case 0:
          System.out.println("System finished");
          break;
        default:
          System.out.println("Invalid option!");
          break;
      }
    }
  }

  public int mainMenu() {
    System.out.println("---------------MENU-----------------");
    System.out.println("  1 - Add new client");
    System.out.println("  2 - Add order to client");
    System.out.println("  3 - Change order status");
    System.out.println("  4 - View all clients");
    System.out.println("  5 - View all orders of a client");
    System.out.println("  0 - Finish Program");
    System.out.println("------------------------------------");

    System.out.println("Choose an option:");
    int op = Integer.parseInt(sc.nextLine());
    return op;
  }

  public void addClient() {
    System.out.println("Adding new cliente:");

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    System.out.print("Birth date (dd/MM/yyyy): ");
    String birthDateString = sc.nextLine();

    LocalDate birthDate = LocalDate.parse(birthDateString, formatter);

    Client client = new Client(name, email, birthDate);
    clients.add(client);

    System.out.println("\nSuccessfully registered client\n");
  }

}
