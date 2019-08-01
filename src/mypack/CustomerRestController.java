package mypack;

import java.util.List;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class CustomerRestController {

	@Autowired
	CustomerDAO customerdao;

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetAllCustomers", headers = "Accept=application/json")
	public String disp(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside disp method");

		List<Customer> list = customerdao.getAllCustomers();
		String json = new Gson().toJson(list);
		return json;

	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/customer", headers = "Accept=application/json")
	// @PostMapping(value="/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("Customer is " + customer);
		customerdao.add(customer);
		return customer;
	}

	@CrossOrigin("http://localhost:4200")
	@PostMapping(value = "/Validuser", headers = "Accept=application/json")
	public String validuser(@RequestBody Customer cust) {
		String isvalid = customerdao.validuser(cust);
		String json = new Gson().toJson(isvalid);
		return json;
	}

}
