package hibernate;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity

public class Products  implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id	
	private int id;
	private String name;
	private double price;
	private int quatity;
	private String image_name;
	
	

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	
	public int getQuatity() {
		return quatity;
	}
	

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}


	


	

	
	

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
