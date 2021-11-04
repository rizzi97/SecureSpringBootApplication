package dev.marcorizzi.secureService;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	
	/*
    @GetMapping("/orders")
    @RolesAllowed({"customer"})
    public String getOrders(Principal principal) {
        return "Response from Product Service, User Id:" + principal.getName();
    }
    */
	
    
	@GetMapping("/customerdetail")
    @RolesAllowed({"Customer"})
    public String getCustomerDetail(Principal principal) {
    	//return "Prova "+ principal.getName();
		return "Customer Details";
        //return Collections.singletonMap("name", principal.getAttribute("name"));
    }
    

    @GetMapping("/customerslist")
    @RolesAllowed({"Manager"})
    public String getProduct(Principal principal) {
        return "Response from Product Service, User Id:" + principal.getName();
    }
    /*@GetMapping("/unsecure")
    public String getUnsecure() {
        return "No strict access!";
    }*/
    
    /*
    - id: cucustomerslist
    uri: http://localhost:8282
    predicates:
      - Path=/customerslist/**
  - id: customerdetail
    uri: http://localhost:8282
    predicates:
      - Path=/customerdetail/**
  - id: product
    uri: http://localhost:8282
    predicates:
      - Path=/product/**
     */
}
