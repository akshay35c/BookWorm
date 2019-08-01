package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class InvoiceDAOImpl implements InvoiceDAO {

	@Autowired
	private HibernateTemplate template;
	
	@Transactional
	@Override
	public void add(Invoice ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List<Invoice> getAllProduct() {
		List<Invoice> list=(List<Invoice>) template.find("from Invoice");
		return list;
	}

	@Override
	public void delete(Invoice ref) {
		// TODO Auto-generated method stub
		template.delete(ref);
	}

}
