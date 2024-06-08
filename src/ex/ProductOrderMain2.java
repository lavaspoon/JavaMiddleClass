package ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProducOrder[] orders = new ProducOrder[3];

        orders[0] = createOrder("두부",2000, 2);
        orders[1] = createOrder("김치", 5000, 2);
        orders[2] = createOrder("콜라", 1000, 2);

        int totalAmout = 0;
        for (ProducOrder order : orders) {
            System.out.println("order = " + order);
            totalAmout += order.price * order.quantity;
        }

        System.out.println("totalAmout = " + totalAmout);
    }

    static ProducOrder createOrder(String productName, int price, int quantity) {
        ProducOrder order = new ProducOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }
}
