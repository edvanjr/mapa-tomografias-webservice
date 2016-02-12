package br.com.tomografiawebservice.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import br.com.tomografiawebservice.controllers.TomografiaController;
import br.com.tomografiawebservice.models.Tomografia;

@Path("tomografia")
public class TomografiaResource {

	@GET
	@Path("{id}")
	@Produces("application/json; charset=UTF-8") 
	public Tomografia tomografiaPorId(@PathParam("id")int id){
		
		TomografiaController controller = new TomografiaController();
		return controller.tomografiaPorId(id);
		
	}
	
	@GET
	@Path("all")
	@Produces("application/json; charset=UTF-8") 
	public Response listaTomografias(){
		
		TomografiaController controller = new TomografiaController();
		GenericEntity<List<Tomografia>> entity = new GenericEntity<List<Tomografia>>(controller.listaTomografias()) {};
		
		return Response.ok(entity).build();
		
	}
	
}
