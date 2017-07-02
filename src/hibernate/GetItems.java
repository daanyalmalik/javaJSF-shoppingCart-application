package hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class GetItems {
	
	public List<Products> getItemList()
	{
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// session = HibernateUtil.getSessionFactory().getCurrentSession();
		Session session = factory.openSession();

		// creating transaction object

		Transaction t = session.beginTransaction();
		System.out.println("Retrieving products");
		Query query = session.createQuery("from Products");
		// query.list() returns objects, cast to List<Location>
		@SuppressWarnings("unchecked")
		List<Products> list = (List<Products>) query.list();
		// plist=(List<Products>)query.list( );
		t.commit();

		/*for (Products l : list) {

			// System.out.println( l.getId() + " " + l.getName() + " "
			// + l.getPrice() + " " + l.getQuatity() + " " + l.getImage_name());
		}*/

		if (session.isOpen())
			session.close();

		System.out.println("successfully Retrived" + list.size());

		return list;
	}
	

}
