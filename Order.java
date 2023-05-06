import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
  private LocalDate moment;
  private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
  private OrderStatus status;
}
