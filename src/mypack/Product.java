package mypack;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productdb")
public class Product {
	int P_product_id;
	String P_name;
	String P_type;
	String P_category_id;
	String P_language_id;
	double P_mrp;
	double P_SP;
	String P_desc;
	String P_author;
	String P_image;
	String P_Rent;
	String P_lib;
	int P_rentamt;
	int P_rentmindays;
	String P_publisher;
	Date P_Fdate;
	Date P_tdate;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getP_product_id() {
		return P_product_id;
	}

	@Column(name = "P_name")
	public String getP_name() {
		return P_name;
	}

	@Column(name = "P_type")
	public String getP_type() {
		return P_type;
	}

	@Column(name = "P_category_id")
	public String getP_category_id() {
		return P_category_id;
	}

	@Column(name = "P_language_id")
	public String getP_language_id() {
		return P_language_id;
	}

	@Column(name = "P_mrp")
	public double getP_mrp() {
		return P_mrp;
	}

	@Column(name = "P_SP")
	public double getP_SP() {
		return P_SP;
	}

	@Column(name = "P_desc")
	public String getP_desc() {
		return P_desc;
	}

	@Column(name = "P_author")
	public String getP_author() {
		return P_author;
	}

	@Column(name = "P_image")
	public String getP_image() {
		return P_image;
	}

	@Column(name = "P_Rent")
	public String getP_Rent() {
		return P_Rent;
	}

	@Column(name = "P_lib")
	public String getP_lib() {
		return P_lib;
	}

	@Column(name = "P_rentamt")
	public int getP_rentamt() {
		return P_rentamt;
	}

	@Column(name = "P_rentmindays")
	public int getP_rentmindays() {
		return P_rentmindays;
	}

	@Column(name = "P_publisher")
	public String getP_publisher() {
		return P_publisher;
	}

	@Column(name = "P_Fdate")
	public Date getP_Fdate() {
		return P_Fdate;
	}

	@Column(name = "P_tdate")
	public Date getP_tdate() {
		return P_tdate;
	}

	//---------------------------------------------------setters---------------------------------------------------
	public void setP_product_id(int p_product_id) {
		P_product_id = p_product_id;
	}

	
	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public void setP_type(String p_type) {
		P_type = p_type;
	}

	public void setP_category_id(String p_category_id) {
		P_category_id = p_category_id;
	}

	public void setP_language_id(String p_language_id) {
		P_language_id = p_language_id;
	}

	public void setP_mrp(double p_mrp) {
		P_mrp = p_mrp;
	}

	public void setP_SP(double p_SP) {
		P_SP = p_SP;
	}

	public void setP_desc(String p_desc) {
		P_desc = p_desc;
	}

	public void setP_author(String p_author) {
		P_author = p_author;
	}

	public void setP_image(String p_image) {
		P_image = p_image;
	}

	public void setP_Rent(String p_Rent) {
		P_Rent = p_Rent;
	}

	public void setP_lib(String p_lib) {
		P_lib = p_lib;
	}

	public void setP_rentamt(int p_rentamt) {
		P_rentamt = p_rentamt;
	}

	public void setP_rentmindays(int p_rentmindays) {
		P_rentmindays = p_rentmindays;
	}

	public void setP_publisher(String p_publisher) {
		P_publisher = p_publisher;
	}

	public void setP_Fdate(Date p_Fdate) {
		P_Fdate = p_Fdate;
	}

	public void setP_tdate(Date p_tdate) {
		P_tdate = p_tdate;
	}

	//--------------------------tostring----------------------
	@Override
	public String toString() {
		return "Product [P_product_id=" + P_product_id + ", P_name=" + P_name + ", P_type=" + P_type
				+ ", P_category_id=" + P_category_id + ", P_language_id=" + P_language_id + ", P_mrp=" + P_mrp
				+ ", P_SP=" + P_SP + ", P_desc=" + P_desc + ", P_author=" + P_author + ", P_image=" + P_image
				+ ", P_Rent=" + P_Rent + ", P_lib=" + P_lib + ", P_rentamt=" + P_rentamt + ", P_rentmindays="
				+ P_rentmindays + ", P_publisher=" + P_publisher + ", P_Fdate=" + P_Fdate + ", P_tdate=" + P_tdate
				+ "]";
	}

	
}