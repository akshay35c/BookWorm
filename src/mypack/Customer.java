package mypack;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customerdb")
public class Customer {

	int cust_id;
	String C_fname;
	String C_lname;
	String C_city;
	String C_emailid;
	long C_contact;
	String C_country;
	String C_password;
	String C_SQ;
	String C_SQA;
	
	
	
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", C_fname=" + C_fname
				+ ", C_lname=" + C_lname + ", C_city=" + C_city
				+ ", C_emailid=" + C_emailid + ", C_contact=" + C_contact
				+ ", C_country=" + C_country + ", C_password=" + C_password
				+ ", C_SQ=" + C_SQ + ", C_SQA=" + C_SQA + "]";
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	@Column(name="FirstName")
	public String getC_fname() {
		return C_fname;
	}
	public void setC_fname(String c_fname) {
		C_fname = c_fname;
	}
	@Column(name="LastName")
	public String getC_lname() {
		return C_lname;
	}
	public void setC_lname(String c_lname) {
		C_lname = c_lname;
	}
	
	@Column(name="City")
	public String getC_city() {
		return C_city;
	}
	public void setC_city(String c_city) {
		C_city = c_city;
	}
	@Column(name="Email")
	public String getC_emailid() {
		return C_emailid;
	}
	public void setC_emailid(String c_emailid) {
		C_emailid = c_emailid;
	}
	@Column(name="Contact")
	public long getC_contact() {
		return C_contact;
	}
	public void setC_contact(long c_contact) {
		C_contact = c_contact;
	}
	@Column(name="Country")
	public String getC_country() {
		return C_country;
	}
	public void setC_country(String c_country) {
		C_country = c_country;
	}
	@Column(name="Password")
	public String getC_password() {
		return C_password;
	}
	public void setC_password(String c_password) {
		C_password = c_password;
	}
	@Column(name="SQ")
	public String getC_SQ() {
		return C_SQ;
	}
	public void setC_SQ(String c_SQ) {
		C_SQ = c_SQ;
	}
	@Column(name="SQA")
	public String getC_SQA() {
		return C_SQA;
	}
	public void setC_SQA(String c_SQA) {
		C_SQA = c_SQA;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}