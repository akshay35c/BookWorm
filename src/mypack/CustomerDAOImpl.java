package mypack;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private HibernateTemplate template;

	@Transactional
	@Override
	public void add(Customer ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> list = (List<Customer>) template.find("from Customer");
		return list;
	}

	
	@Override
	public String validuser(Customer cust) {
		String emailid = cust.getC_emailid();
		String password = cust.getC_password();

		List<Customer> l = getAllCustomers();
		Iterator itr = l.iterator();
		String valid = "not valid";

		while (itr.hasNext()) {
			Customer ob = (Customer) itr.next();
			String Email = ob.getC_emailid();
			String Password = ob.getC_password();
			if ((Email.equals(emailid)) && (Password.equals(password))) {
				valid = "valid user";
				return valid;

			}
		}
		return valid;
	}

}
