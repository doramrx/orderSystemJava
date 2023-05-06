public class OrderItem {
  private Integer quantity;
  private Double price;
  private Product product;

  public OrderItem(Integer quantity, Double price, Product product) {
    this.quantity = quantity;
    this.price = price;
    this.product = product;
  }

  public Double subTotal() {
    this.price = this.product.getPrice() * this.quantity;
    return this.price;
  }

}
