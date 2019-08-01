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
public class ProductRestController {

	@Autowired
	ProductDAO productdao;

	//all product
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetAllProduct", headers = "Accept=application/json")
	public String disp(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside disp method");

		List<Product> list = productdao.getAllProduct();
		String json = new Gson().toJson(list);
		return json;

	}

	//edit product
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/product", headers = "Accept=application/json")
	// @PostMapping(value="/product")
	public Product addProduct(@RequestBody Product product) {
		System.out.println("Product   is " + product);
		productdao.add(product);
		return product;
	}
	
	//ebook
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(value = "/GetEbook", headers = "Accept=application/json")
	public String dispEbook(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("inside disp method");

		List<Product> list = productdao.getEbookProduct();
		String json = new Gson().toJson(list);
		return json;

	}
	
	//audiobook
		@CrossOrigin(origins = "http://localhost:4200")
		@GetMapping(value = "/GetAudio", headers = "Accept=application/json")
		public String dispEAudio(HttpServletRequest request, HttpServletResponse response) {
			System.out.println("inside disp method");

			List<Product> list = productdao.getAudioProduct();
			String json = new Gson().toJson(list);
			return json;

		}

}
