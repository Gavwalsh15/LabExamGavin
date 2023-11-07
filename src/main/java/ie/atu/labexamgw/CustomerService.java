package ie.atu.labexamgw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private Customer customer;

    public static void createCustomer(Customer customer){
        customer = new Customer();
    }

    public Object getCustomerById(int id){
        return customer.getCustomerId();
    }

    public int getCustomerAge(int id){
        return customer.getAge();
    }
}
