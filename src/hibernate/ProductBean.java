package hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name = "getitems")
@SessionScoped
public class ProductBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<Products> plist = new ArrayList<Products>();

	public ProductBean() {

	}

	public List<Products> getPlist() {
		
		GetItems itm= new GetItems();
		return itm.getItemList();
	}

	public void setPlist(List<Products> plist) {
		this.plist = plist;
	}

}
