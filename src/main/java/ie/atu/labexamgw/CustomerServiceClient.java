package ie.atu.labexamgw;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "customer-Service", url = "http://localhost:8080")
public interface CustomerServiceClient {
    @PostMapping("/confirm")
    int CustomerId(@RequestBody Order order);
}
