package com.p1;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import antlr.collections.List;

public class HibernateManager {
	Session session;
	public void HibernateManager()
	{
		
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		ServiceRegistryBuilder builder = new 
				ServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
	
		session =sessionFactory.openSession();
		System.out.println("Connected to Pf....");
	
	}
	public void saveObj(Student s1 ) {
		Transaction transation = session.beginTransaction();
		session.save(s1);
		transation.commit();
	}public void getAll() {
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("From Student");
		List list = query.list();
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			Student s = (Student)itr.next();
			System.out.println(s.getSid()+"------"+s.getSname());
		}
		transaction.commit();
	}
	public void getSpecific(int sid) {
		Transaction transaction = session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		System.out.println(s.getSid()+"------"+s.getSname());
		transaction.commit();
	}
	public void updateDate(String newName, int sid) {
			Transaction transaction = session.beginTransaction();
			Student s = (Student)session.get(Student.class, sid);
			s.setSname(newName);
			session.update(s);
			beginTransaction.commit();
		}
	public void deleteData(int sid) {
		Transaction transaction = session.beginTransaction();
		Student s = (Student)session.get(Student.class, sid);
		s.setSname(newName);
		session.delete(s);
		beginTransaction.commit();
		
		
}
