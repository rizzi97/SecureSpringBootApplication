package dev.marcorizzi.secureService;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
   
	@GetMapping("/customerdetail")
    public String getCustomerDetail() {
		return "Customer Details";

    }
    

    @GetMapping("/customerslist")
    public String getProduct() {
        return "Response from Product Service";
    }

}
