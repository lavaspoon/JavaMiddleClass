package ex;

public class ProducOrder {
    String productName;
    int price;
    int quantity;

    @Override
    public String toString() {
        return "ProducOrder{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
