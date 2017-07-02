package hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "shopcart")
@SessionScoped
public class ShoppingCart implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Items> cart= new ArrayList<Items>();
	private Products p;
	private double total;
	
	
	public List<Items> getCart() {
		return cart;
	}
	
	public void setCart(List<Items> cart) {
		this.cart = cart;
	}
	
	public double getTotal() {
		
		for(Items itm : cart)
		{
			total += itm.getQunatity()*itm.getProd().getPrice(); 
		}
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void setProd(Products p)
	{
		this.p=p;
	}
	
	public String addtoCart(Products p)
	{

		for(Items item : cart)
		{
			if(item.getProd().getId()==p.getId())  //if doesnt work use .equals
			{
				item.setQunatity(item.getQunatity()+1);
				return "shoppingcart";
			}
		}
		System.out.println("dano");
		Items temp= new Items();
		temp.setQunatity(1);
		temp.setProd(p);
		cart.add(temp);
		return "shoppingcart";
		
	}
	
	public void removeItem(Items I)
	
	{
		
		for(Items item : cart)
		{
			if(item.equals(I))
			{
				System.out.println("removed" + I.getProd().getName());
				cart.remove(item);
				
				break;
			}
		}
	}
	
public String emptyCart()
	{	
			cart.clear();
			this.total=0;
			return "index";
	}


	public void updateItem()
	{
		System.out.println("removed");
	}
	
	
	
}
