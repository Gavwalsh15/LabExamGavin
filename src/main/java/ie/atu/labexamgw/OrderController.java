package ie.atu.labexamgw;

import org.springframework.web.bind.annotation.*;


@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Order order){
        Customer customer;
        if(customer.getAge() <= 18) {
            OrderService.createmyOrder(order);
            return "Order Created";
        }else{
            return "You are not old enough";
        }
    }
    @GetMapping("/getOrderById/{id}")
    public Object getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }
}
