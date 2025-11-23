class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }
    String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }
    @Override
    String getOrderStatus() {
        return "Order shipped. Tracking: " + trackingNumber;
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }
    @Override
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}
public class OrderTest {
    public static void main(String[] args) {
        Order o1 = new Order(101, "2025-09-20");
        Order o2 = new ShippedOrder(102, "2025-09-21", "TRK123");
        Order o3 = new DeliveredOrder(103, "2025-09-22", "TRK456", "2025-09-23");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
