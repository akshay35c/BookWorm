package mypack;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private HibernateTemplate template;
    
	@Transactional
	@Override
	public void add(Product ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> list=(List<Product>) template.find("from Product" );
		return list;
	}

	@Override
	public List<Product> getEbookProduct() {
		List<Product> list=(List<Product>) template.find("from Product WHERE P_type='ebook'" );
		return list;
	}

	@Override
	public List<Product> getAudioProduct() {
		List<Product> list=(List<Product>) template.find("from Product WHERE P_type='audio'" );
		return list;
	}

	
	

}
