package dev.marcorizzi.secureService;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
    @GetMapping("/p")
    public String getOrders(@AuthenticationPrincipal OAuth2User principal) {
    	return "Prova "+ principal.getAttribute("username");
        //return Collections.singletonMap("name", principal.getAttribute("name"));
    }
    
    @GetMapping("/manageproduct/{product_id}")
    @RolesAllowed({"Manager"})
    public String manageProduct(@PathVariable("product_id") Integer product_id) {
        //return "Response from Product Service, User Id:" + principal.getName();
        return "Management of product"+product_id.toString();
    }
    
    
    @GetMapping("/product/{product_id}")
    public String getProductDetails(@PathVariable("product_id") Integer product_id) {
    	return "Example Product";
    }
    @GetMapping("/productlist")
    public String getProductList() {
        return "Example of a product list";
    }  


}