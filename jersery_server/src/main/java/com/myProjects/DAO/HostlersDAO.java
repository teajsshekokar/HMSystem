package com.myProjects.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.myProjects.DTO.Hostlers;
import com.myProjects.DTO.Hsttransections;
import com.myProjects.DTO.ParentsId;



public class HostlersDAO {

	private Session currentSession;
	private Transaction currentTransaction;
	
	    
	    public Session openCurrentSession() {
	        currentSession = getSessionFactory().openSession();
	        return currentSession;
	        
	    }
	
	 
	
	    public Session openCurrentSessionwithTransaction() {
	        currentSession = getSessionFactory().openSession();
	        currentTransaction = currentSession.beginTransaction();
	       return currentSession;
	    }
	
	     
	
	    public void closeCurrentSession() {
	        currentSession.close();
	    }
	
	    public void closeCurrentSessionwithTransaction() {
	        currentTransaction.commit();
	        currentSession.close();
	    }
	
	     
	
	    private static SessionFactory getSessionFactory() {
	        Configuration configuration = new Configuration().configure().addAnnotatedClass(Hostlers.class).addAnnotatedClass(Hsttransections.class).addAnnotatedClass(ParentsId.class);
	        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
	               .applySettings(configuration.getProperties());
	        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
	        return sessionFactory;
	    }
	
	    public Session getCurrentSession() {
	        return currentSession;
	    }
	 
		    public void setCurrentSession(Session currentSession) {
	       this.currentSession = currentSession;
	    }
	
	    public Transaction getCurrentTransaction() {	
	        return currentTransaction;
	    }
		
	    public void setCurrentTransaction(Transaction currentTransaction) {
		        this.currentTransaction = currentTransaction;
	    }
	
	 
	    //List of all Hostlers
	    @SuppressWarnings("unchecked")
	    public Collection<Hostlers> findAll() {
	    	        Collection<Hostlers> hostlers = new ArrayList<Hostlers>();
	    	        hostlers =(List<Hostlers>) getCurrentSession().createQuery("from Hostlers").list();
	    	        return hostlers;
	    	    }
	    @SuppressWarnings("unchecked")
	    public Collection<Hostlers> findByID(int a) {
	    	        Collection<Hostlers> hostlers = new ArrayList<Hostlers>();
	    	        hostlers =(List<Hostlers>) getCurrentSession().createQuery("from Hostlers where id="+a).list();
	    	        return hostlers;
	    	    }
	    
	    //To add new entry in hostler table
	    public void createRow(Hostlers hostlers){
	    	  		getCurrentSession().save(hostlers); 	  
	    }
	    
	    //To check login credentials
	    public Hostlers isLoginValid(String username, String password){
	    	Hostlers h1 = new Hostlers();
	    			h1 = (Hostlers)getCurrentSession().createQuery("from Hostlers where eMail=:username and password= :password")
	    					.setParameter("username", username)
	    					.setParameter("password", password)
	    					.uniqueResult();
	    			System.out.println(h1);
	   	    	return h1;
	    }
}
