package ie.atu.labexamgw;

import org.springframework.web.bind.annotation.*;


@RestController
public class OrderController {
    private final OrderService orderService;


    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @PostMapping("/createOrder")
    public void createOrder(@RequestBody Order order){
        OrderService.createmyOrder(order);
    }
    @GetMapping("/getOrderById/{id}")
    public Object getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }
}
