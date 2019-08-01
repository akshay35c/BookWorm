package mypack;
import java.util.List;

public interface ProductDAO {
	
     void add(Product ref);
     
     List<Product> getAllProduct();

     List<Product> getEbookProduct();

     List<Product> getAudioProduct();
}
