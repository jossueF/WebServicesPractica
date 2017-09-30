package com.jossue.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{name}")
	public Response getMsg(@PathParam("name") String name){
		String output = "Bienvenido " + name;
		return Response.status(200).entity(output).build();
	}
	
	@POST
	@Path("/{edad}")
	public Response getEdad(@PathParam("edad") String edad){
		String output2 = "Cuantos años tienes?" + edad;
		return Response.status(200).entity(output2).build();
	}
}
