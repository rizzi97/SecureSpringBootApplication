package dev.marcorizzi.secureService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
    
    @GetMapping("/manageproduct/{product_id}")
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