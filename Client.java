import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Client {
  private String name;
  private String email;
  private LocalDate birthDate;
  private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  private ArrayList<Order> orders = new ArrayList<>();

  public Client(String name, String email, LocalDate birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void addOrder(Order order) {
    this.orders.add(order);
  }

}