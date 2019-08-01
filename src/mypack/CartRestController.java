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
public class CartRestController {


	@Autowired
	CartDAO cartdao;

	//all product
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetAllCart", headers = "Accept=application/json")
	public String disp(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside disp method");

		List<Cart> list = cartdao.getAllProduct();
		String json = new Gson().toJson(list);
		return json;

	}

	//edit product
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/cart", headers = "Accept=application/json")
	// @PostMapping(value="/product")
	public Cart addProduct(@RequestBody Cart cart) {
		System.out.println("Product   is " + cart);
		cartdao.add(cart);
		return cart;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/delcart", headers = "Accept=application/json")
	// @PostMapping(value="/product")
	public Cart deletes(@RequestBody Cart cart) {
		System.out.println("Product   is " + cart);
		cartdao.delete(cart);
		return cart;
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/deleteallcart", headers = "Accept=application/json")
	public void deleteall(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside deleteall method");
		cartdao.deleteall();

	}
	
}
