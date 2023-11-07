package ie.atu.labexamgw;

import org.springframework.stereotype.Service;



@Service
public class OrderService {
    private Order order;
    public static void createmyOrder(Order order){
        order = new Order();
    }

    public Object getOrderById(int id){
        return order.getOrderId();
    }
}
