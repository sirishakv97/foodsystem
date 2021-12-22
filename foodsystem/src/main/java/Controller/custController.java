package Controller;


	import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import Entities.Customer;
import Services.CustomerService;

	@RestController

	public class custController {
	
		@Autowired
		CustomerService cs;
		
		
		@GetMapping("/test")
		public String test()
		{
			return "ListCustomer.jsp";		
		}
		
		
		
		
		@GetMapping("/customer")
		public ArrayList<Customer> getAllCustomer()
		{
			return cs.getAllCustomers();		
		}
		
		
		
		
		@GetMapping("/product/{pid}")
		public Customer getProductID(@PathVariable("cust_id") int d)
		{
			return cs.findbyid(d);
		}
		
		
		@PostMapping("/addproduct")
		public int saveProduct(@RequestBody Customer cd)
		{
			cs.addproduct(cd);
			return cd.getCust_id();
			
		}
		
		
		@PutMapping("/updateproduct")
		public int updateProduct(@RequestBody Customer cd)
		{	   
			cs.updateproduct(cd);
			return cd.getCust_id();
			
		}
		
		
		@DeleteMapping("/deleteproduct/{id}")
		public void deleteProduct(@PathVariable("cust_id") int d)
		{
			cs.deleteproduct(d);
					
		}
		
	}



