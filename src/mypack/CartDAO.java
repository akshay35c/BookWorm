package mypack;

import java.util.List;

public interface CartDAO {

	 void add(Cart ref);
	 List<Cart> getAllProduct();
	 void delete(Cart ref);
	 void deleteall();
}
