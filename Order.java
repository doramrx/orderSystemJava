import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
  private LocalDate moment;
  private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
  private OrderStatus status;
  private ArrayList<OrderItem> orderItens = new ArrayList<>();

  public Order(LocalDate moment, OrderStatus status) {
    this.moment = moment;
    this.status = status;
  }

  public void addItem(OrderItem item) {
    this.orderItens.add(item);
  }

  public void removeItem(OrderItem item) {
    this.orderItens.remove(item);
  }

  public Double total() {
    Double total = 0.0;

    for (OrderItem oi : orderItens) {
      total += oi.subTotal();
    }

    return total;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("ORDER SUMMARY:\n");
    sb.append("Order moment: " + this.moment.format(formatter) + "\n");
    sb.append("Order status: " + status);

    return sb.toString();
  }

}
