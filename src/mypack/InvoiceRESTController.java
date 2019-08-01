package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class InvoiceRESTController {

	@Autowired
	InvoiceDAO invoicedao;
	
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetAllInvoice", headers = "Accept=application/json")
	public String disp(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside disp method");

		List<Invoice> list = invoicedao.getAllProduct();
		String json = new Gson().toJson(list);
		return json;

	}

	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/invoice", headers = "Accept=application/json")
	// @PostMapping(value="/product")
	public Invoice addProduct(@RequestBody Invoice cart) {
		System.out.println("Product   is " + cart);
		invoicedao.add(cart);
		return cart;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/delinvoice", headers = "Accept=application/json")
	// @PostMapping(value="/product")
	public Invoice deletes(@RequestBody Invoice cart) {
		System.out.println("Product   is " + cart);
		invoicedao.delete(cart);
		return cart;
	}
	
	
}
