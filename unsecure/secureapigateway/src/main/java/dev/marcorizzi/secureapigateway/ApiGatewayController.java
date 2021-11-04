package dev.marcorizzi.secureapigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGatewayController {

    
    @GetMapping("/me")
    public String user() {
    	return "User Details";
    	
    }
    

   
    
}