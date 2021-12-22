package Controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;

import Entities.Customer;
	 
	@Controller
	public class mvcController {
	   @RequestMapping(value = "/Customer", method = RequestMethod.GET)
	   public ModelAndView student() {
	      return new ModelAndView("customer", "command", new Customer());
	   }
	 
	   @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Customer student, 
	   ModelMap model) {
	      model.addAttribute("cust_id", student.getCust_id());
	      model.addAttribute("cust_name", student.getCust_name());
	      model.addAttribute("password", student.getPassword());
	      model.addAttribute("phone", student.getPhn_num());
	      model.addAttribute("Address", student.getAddress());
	 
	      return "welcome";
	   }

}
