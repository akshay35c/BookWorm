package mypack;

import java.util.List;

public interface InvoiceDAO {

	 void add(Invoice ref);
	 List<Invoice> getAllProduct();
	 void delete(Invoice ref);
}
