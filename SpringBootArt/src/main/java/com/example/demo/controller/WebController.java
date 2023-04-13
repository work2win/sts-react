package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
 

@RestController
public class WebController {
	
	@Autowired
	CustomerRepository repository;
	
	 @RequestMapping("/save")
	    public String process(){
	        repository.save(new Customer("Jack", "Smith"));
	        repository.save(new Customer("Adam", "Johnson"));
	        repository.save(new Customer("Kim", "Smith"));
	        repository.save(new Customer("David", "Williams"));
	        repository.save(new Customer("Peter", "Davis"));
	        return "Done";
	    }
	      
	      
	    @RequestMapping("/findall")
	    public String findAll(){
	        String result = "<html>";
	          
	        for(Customer cust : repository.findAll()){
	            result += "<div>" + cust.toString() + "</div>";
	        }
	          
	        return result + "</html>";
	    }
	      
	    @RequestMapping("/findbyid")
	    public String findById(@RequestParam("id") long id){
	        String result = "";
	        result = repository.findById(id).toString();
	        return result;
	    }
	      
	    @RequestMapping("/findbylastname")
	    public String fetchDataByLastName(@RequestParam("lastname") String lastName){
	        String result = "<html>";
	          
	        for(Customer cust: repository.findByLastName(lastName)){
	            result += "<div>" + cust.toString() + "</div>"; 
	        }
	          
	        return result + "</html>";
	    }
	    
	    
	    @RequestMapping("/web")
		public String  web() {
			return "hello";	
		}
	    
	    @RequestMapping("/welcome")
	    public String welcomeAsHTML() {
	            return "<html>\n" + "<header><title>Welcome</title></header>\n" +
	              "<body>\n" + "Welcome Page\n" + "</body>\n" + "</html>";
	    }
	    

}
