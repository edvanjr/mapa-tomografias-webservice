package br.com.tomografiawebservice.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hachura {
	
	private int id;
	private String conteudo;
	
	public Hachura() {
		
	}
	
	public Hachura(int id, String conteudo) {
		super();
		this.id = id;
		this.conteudo = conteudo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	@Override
	public String toString() {
		return "Hachura [id=" + id + ", conteudo=" + conteudo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hachura other = (Hachura) obj;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
