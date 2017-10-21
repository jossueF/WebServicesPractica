package com.jossue.webservices.dao;

import java.util.ArrayList;
import java.util.List;

import com.jossue.webservices.modelo.Articulo;

public final class BaseDeDatos {

	private final static BaseDeDatos baseDeDatos = new BaseDeDatos();
	private final List<Articulo> listado = new ArrayList<>();
	
	private BaseDeDatos(){
		Articulo art1 = new Articulo(1, "Mi primer título", "Este es el contenido", "JFV");
		Articulo art2 = new Articulo(2, "Mi segundo título", "Este es el contenido dos", "JFV");
		listado.add(art1);
		listado.add(art2);
	}
	
	public static BaseDeDatos getInstance(){
		return baseDeDatos;
	}
	
	public List<Articulo> getListado(){
		return listado;
	}
	
}
