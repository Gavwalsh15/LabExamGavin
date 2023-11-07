package ie.atu.labexamgw;

import org.springframework.stereotype.Service;



@Service
public class OrderService {
    public Order myOrder;

    public OrderService(){
        this.myOrder = new Order();
    }

    public static void createmyOrder(Order order){
        myOrder = order;
    }

    public Object getOrderById(int id){
        return order;
    }
}
