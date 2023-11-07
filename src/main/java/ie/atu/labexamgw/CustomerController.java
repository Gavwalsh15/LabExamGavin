package ie.atu.labexamgw;

import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/createCustomer")
    public void createCustomer(@RequestBody Customer customer){
        CustomerService.createCustomer(customer);
    }
    @GetMapping("/getCustomerById/{id}")
    public Object getOrderById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }
}
