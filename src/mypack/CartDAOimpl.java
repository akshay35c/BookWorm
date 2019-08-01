package mypack;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class CartDAOimpl implements CartDAO {

	@Autowired
	private HibernateTemplate template;
    
	@Transactional
	@Override
	public void add(Cart ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List<Cart> getAllProduct() {
		// TODO Auto-generated method stub
		List<Cart> list=(List<Cart>) template.find("from Cart");
		return list;
	}
	
	@Override
	 public void delete(Cart ref)  
	 {  
	  template.delete(ref);
	 }

	@Override
	public void deleteall() {
		// TODO Auto-generated method stub
		template.deleteAll(getAllProduct());
	}

}
