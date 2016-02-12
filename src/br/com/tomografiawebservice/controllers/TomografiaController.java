package br.com.tomografiawebservice.controllers;

import java.util.Iterator;
import java.util.List;

import br.com.tomografiawebservice.dados.Dados;
import br.com.tomografiawebservice.models.Tomografia;


/**
 * Classe de controller para tomografia
 * @author Edvan Jr
 *
 */
public class TomografiaController {

	// Retorna tomografia específica 
	public Tomografia tomografiaPorId(int id){
		
		Iterator<Tomografia> it = listaTomografias().iterator();
		while (it.hasNext()) {
		  Tomografia tomografia = it.next();
		  if (tomografia.getId() == id) {
		    return tomografia;
		  }
		}
		
		return new Tomografia();
	}
	
	
	// Retorna todas as tomografias
	public List<Tomografia> listaTomografias(){
		return Dados.tomografias();
	}
	
}
