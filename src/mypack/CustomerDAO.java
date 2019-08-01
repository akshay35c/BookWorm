package mypack;

import java.util.List;

public interface CustomerDAO {
	
     void add(Customer ref);
     
     List<Customer> getAllCustomers();
     public String validuser(Customer cust);
}
