package com.myProjects.ResourcesREST;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.myProjects.DAO.HostlersDAO;
import com.myProjects.DTO.Hostlers;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	private HostlersDAO hsDao = new HostlersDAO();
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    
    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hostlers> getNew() {
    	hsDao.openCurrentSessionwithTransaction();
    	List<Hostlers> hostles = new ArrayList<Hostlers>();
    	hostles = (List<Hostlers>)hsDao.findAll();
    	System.out.println(hostles);
    	hsDao.closeCurrentSessionwithTransaction();
        return hostles;
    }
    
    @GET
    @Path("byid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Hostlers> getById(@PathParam("id") int id) {
    	hsDao.openCurrentSessionwithTransaction();
    	List<Hostlers> hostles = new ArrayList<Hostlers>();
    	hostles = (List<Hostlers>)hsDao.findByID(id);
    	System.out.println(hostles);
    	hsDao.closeCurrentSessionwithTransaction();
        return hostles;
    }
    
    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Hostlers createR(Hostlers hostlers){
    	hsDao.openCurrentSessionwithTransaction();
    	hsDao.createRow(hostlers);
       	hsDao.closeCurrentSessionwithTransaction();
    	return hostlers;
    }
    
    @GET
    @Path("login/{email}/{pass}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
   public Hostlers checkLoginIsValic(@PathParam("email") String email,@PathParam("pass") String pass){
    	hsDao.openCurrentSessionwithTransaction();
    	Hostlers h1 = hsDao.isLoginValid(email, pass);
    	hsDao.closeCurrentSessionwithTransaction();
    	
    	return h1;
    }
    

}
