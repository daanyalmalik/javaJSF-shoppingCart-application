package hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class StoreData {  
public static void main(String[] args) {  
	StoreObject();
	RetreiveValues();
     
}  
public static String StoreObject(){

	 SessionFactory factory=HibernateUtil.getSessionFactory();
//	  session = HibernateUtil.getSessionFactory().getCurrentSession();
	  Session session=factory.openSession();  
  
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    //Employee e1=new Employee();  
//    e1.setId(118);  
    //e1.setFirstName("Atif");  
    //e1.setLastName("Jilani");  
    
    Products p1=new Products();
    
    p1.setId(3);
    p1.setName("Samsung Galaxy S6");
    p1.setPrice(60000);
    p1.setQuatity(12);
    p1.setImage_name("/img3.jpg");
    
    
    session.persist(p1);//persisting the object  
      
    t.commit();//transaction is committed  
    if ( session.isOpen() ) session.close();
     
    System.out.println("successfully saved"); 
    return "successfully saved";
}
//public static void DeleteValues(){
//	 SessionFactory factory=HibernateUtil.getSessionFactory();
////	  session = HibernateUtil.getSessionFactory().getCurrentSession();
//	  Session session=factory.openSession();  
// 
//   //creating transaction object  
// 
//	    Transaction t=session.beginTransaction();  
//	    System.out.println("Retrieving Products");
//	    Query query = session.createQuery("from Products");
//		// query.list() returns objects, cast to List<Location>
//		List<Products> list = (List<Products>)query.list( );
//		
//
//		for(Products l : list ) 
//		session.delete(l);
//		t.commit();
//		if ( session.isOpen() ) session.close();
//
//	    System.out.println("successfully Deleted");
// }
public static void  RetreiveValues(){
	 SessionFactory factory=HibernateUtil.getSessionFactory();
//	  session = HibernateUtil.getSessionFactory().getCurrentSession();
	  Session session=factory.openSession();  

  //creating transaction object  

	    Transaction t=session.beginTransaction();  
	    System.out.println("Retrieving products");
	    Query query = session.createQuery("from Products");
		// query.list() returns objects, cast to List<Location>
		List<Products> list = (List<Products>)query.list( );
		t.commit();
		
		for(Products l : list )
			{
					
					System.out.println( l.getId() + "  " + l.getName()  + "  " 
							 + l.getPrice()  + "  " + l.getQuatity()  + "  " + l.getImage_name());
			}
			

		
		if ( session.isOpen() ) session.close();

	    System.out.println("successfully Retrived");
	    
		//return list;
}
}  