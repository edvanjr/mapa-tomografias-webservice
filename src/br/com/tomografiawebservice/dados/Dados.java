package br.com.tomografiawebservice.dados;

import java.util.ArrayList;
import java.util.List;

import br.com.tomografiawebservice.models.Hachura;
import br.com.tomografiawebservice.models.Tomografia;

public class Dados {
	
	
	public static List<Tomografia> tomografias(){
		List<Tomografia> tomografias = new ArrayList<Tomografia>();
		
		// Tomografia 009
		List<Hachura> hachuras009 = new ArrayList<Hachura>();
		hachuras009.add(new Hachura(1, "C�lulas da Mast�ide"));
		Tomografia tc009 = new Tomografia(1, "tc009", hachuras009);
		tomografias.add(tc009);
		
		// Tomografia 010
		List<Hachura> hachuras010 = new ArrayList<Hachura>();
		hachuras010.add(new Hachura(2, "C�lulas da Mast�ide"));
		hachuras010.add(new Hachura(3, "Canal Semicircular Superior"));
		hachuras010.add(new Hachura(4, "Seio Sigm�ide"));
		Tomografia tc010 = new Tomografia(2, "tc010", hachuras010);
		tomografias.add(tc010);
		
		// Tomografia 011
		List<Hachura> hachuras011 = new ArrayList<Hachura>();
		hachuras011.add(new Hachura(5, "Seio Sigm�ide"));
		hachuras011.add(new Hachura(6, "Antro da Mast�ide"));
		hachuras011.add(new Hachura(7, "Aditus ad Antrum"));
		hachuras011.add(new Hachura(8, "Canal Semicircular Superior"));
		hachuras011.add(new Hachura(9, "Epit�mpano"));
		Tomografia tc011 = new Tomografia(3, "tc011", hachuras011);
		tomografias.add(tc011);
		
		// Tomografia 012
		List<Hachura> hachuras012 = new ArrayList<Hachura>();
		hachuras012.add(new Hachura(10, "Seio Sigm�ide"));
		hachuras012.add(new Hachura(11, "Antro da Mast�ide"));
		hachuras012.add(new Hachura(12, "Aditus ad Antrum"));
		hachuras012.add(new Hachura(13, "Canal Semicircular Lateral"));
		hachuras012.add(new Hachura(14, "F�veo do Aqueduto Vestibular �sseo"));
		hachuras012.add(new Hachura(15, "Crura Comum do Canal Semicircular"));
		hachuras012.add(new Hachura(16, "CAI"));
		hachuras012.add(new Hachura(17, "Martelo"));
		hachuras012.add(new Hachura(18, "Epit�mpano"));
		Tomografia tc012 = new Tomografia(4, "tc012", hachuras012);
		tomografias.add(tc012);
		
		// Tomografia 013
		List<Hachura> hachuras013 = new ArrayList<Hachura>();
		hachuras013.add(new Hachura(19, "Seio Sigm�ide"));
		hachuras013.add(new Hachura(20, "Antro da Mast�ide"));
		hachuras013.add(new Hachura(21, "Aditus ad Antrum"));
		hachuras013.add(new Hachura(22, "Canal Semicircular Lateral"));
		hachuras013.add(new Hachura(23, "Septo de Korner"));
		hachuras013.add(new Hachura(24, "Crura Comum do Canal Semicircular"));
		hachuras013.add(new Hachura(25, "Meato Ac�stico Interno"));
		hachuras013.add(new Hachura(26, "Martelo"));
		hachuras013.add(new Hachura(27, "Espa�o de Prussak"));
		hachuras013.add(new Hachura(28, "Bigorna"));
		hachuras013.add(new Hachura(29, "Epit�mpano"));
		Tomografia tc013 = new Tomografia(5, "tc013", hachuras013);
		tomografias.add(tc013);
		
		// Tomografia 014
		List<Hachura> hachuras014 = new ArrayList<Hachura>();
		hachuras014.add(new Hachura(30, "Seio Sigm�ide"));
		hachuras014.add(new Hachura(31, "Antro da Mast�ide"));
		hachuras014.add(new Hachura(32, "Aditus ad Antrum"));
		hachuras014.add(new Hachura(33, "Canal Semicircular Lateral"));
		hachuras014.add(new Hachura(34, "Septo de Korner"));
		hachuras014.add(new Hachura(35, "Crura Comum do Canal Semicircular"));
		hachuras014.add(new Hachura(36, "Meato Ac�stico Interno"));
		hachuras014.add(new Hachura(37, "Martelo"));
		hachuras014.add(new Hachura(38, "Espa�o de Prussak"));
		hachuras014.add(new Hachura(39, "Bigorna"));
		hachuras014.add(new Hachura(40, "Epit�mpano"));
		hachuras014.add(new Hachura(41, "Nervo Facial"));
		hachuras014.add(new Hachura(42, "Vest�bulo"));
		Tomografia tc014 = new Tomografia(6, "tc014", hachuras014);
		tomografias.add(tc014);
		
		// Tomografia 015
		List<Hachura> hachuras015 = new ArrayList<Hachura>();
		hachuras015.add(new Hachura(43, "Seio Sigm�ide"));
		hachuras015.add(new Hachura(44, "Antro da Mast�ide"));
		hachuras015.add(new Hachura(45, "Nervo facial"));
		hachuras015.add(new Hachura(46, "Canal Semicircular Posterior"));
		hachuras015.add(new Hachura(47, "Septo de Korner"));
		hachuras015.add(new Hachura(48, "Nervo Facial (G�nglio Geniculado)"));
		hachuras015.add(new Hachura(49, "Meato Ac�stico Interno"));
		hachuras015.add(new Hachura(50, "Martelo"));
		hachuras015.add(new Hachura(51, "Espa�o de Prussak"));
		hachuras015.add(new Hachura(52, "Bigorna"));
		hachuras015.add(new Hachura(53, "Nervo Facial (p. timp�nica)"));
		hachuras015.add(new Hachura(54, "Vest�bulo"));
		Tomografia tc015 = new Tomografia(7, "tc015", hachuras015);
		tomografias.add(tc015);
		
		return tomografias;
	}
	
}
