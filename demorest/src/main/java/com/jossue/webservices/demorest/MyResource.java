package com.jossue.webservices.demorest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jossue.webservices.modelo.Articulo;
import com.jossue.webservices.servicio.ArticuloServicio;

@Path("articulos")
public class MyResource {

	ArticuloServicio servicio = new ArticuloServicio();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Articulo> getArticulos() {
    	return servicio.getArticulos();
    }
    
    @GET
    @Path("/{articuloId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo getArticulo(@PathParam("articuloId") int id){
    	return servicio.getArticulo(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo addArticulo(Articulo articulo){
    	return servicio.addArticulo(articulo);
    }
    
    @DELETE
    @Path("/{articuloId}")
    public void deleteArticulo(@PathParam("articuloId") int id){
    	servicio.deleteArticulo(id);
    }
    
    @PUT
    @Path("/{articuloId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Articulo updateArticulo(@PathParam("articuloId") int id, Articulo articulo){
    	articulo.setId(id);
    	return servicio.updateArticulo(articulo);
    }
}
