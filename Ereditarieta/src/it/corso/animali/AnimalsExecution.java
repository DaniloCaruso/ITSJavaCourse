package it.corso.animali;

import it.corso.animali.marini.AnimaliMarini;
import it.corso.animali.marini.Balena;
import it.corso.animali.marini.PescePalla;

public class AnimalsExecution {

	public static void main(String[] args) {
		
		PescePalla pescePallaPippo = new PescePalla("Giallo", "Maschio", 1, 1 , 10);
		Balena balenaPeppa = new Balena("Grigia", "Femmina", 100000, 20, 110);
		
		System.out.println("I pesci creati sono carnivori?");
		System.out.println("Pesce Palla: "+pescePallaPippo.isCarnivoro());
		System.out.println("Balena: "+balenaPeppa.isCarnivoro());
	
		balenaPeppa.setQuantitaDiOssigeno(balenaPeppa.getQuantitaDiOssigeno() - 20);
		System.out.println("Hai esaurito l'ossigeno Balena?");
		AnimalsExecution.controllaOssigeno(balenaPeppa);
		
		System.out.println("I pesci creati sono da profondità?");
		System.out.println("Pesce Palla: "+pescePallaPippo.isDaFondaliProfondi());
		System.out.println("Balena: "+balenaPeppa.isDaFondaliProfondi());
		
		balenaPeppa.setQuantitaDiOssigeno(balenaPeppa.getQuantitaDiOssigeno() - 20);
		System.out.println("Hai esaurito l'ossigeno Balena?");
		AnimalsExecution.controllaOssigeno(balenaPeppa);
		
		
		System.out.println("I pesci creati respirano?");
		System.out.println("Pesce Palla: "+pescePallaPippo.respira());
		System.out.println("Balena: "+balenaPeppa.respira());
		
		balenaPeppa.setQuantitaDiOssigeno(balenaPeppa.getQuantitaDiOssigeno() - 30);
		System.out.println("Hai esaurito l'ossigeno Balena?");
		AnimalsExecution.controllaOssigeno(balenaPeppa);
		
		System.out.println("I pesci creati sono nuotano?");
		System.out.println("Pesce Palla: "+pescePallaPippo.nuota());
		System.out.println("Balena: "+balenaPeppa.nuota());
		
		balenaPeppa.setQuantitaDiOssigeno(balenaPeppa.getQuantitaDiOssigeno() - 30);
		System.out.println("Hai esaurito l'ossigeno Balena?");
		AnimalsExecution.controllaOssigeno(balenaPeppa);
		
	}
	
	public static void controllaOssigeno(Balena balena){
		if(balena.emergePerRespirare()){
			System.out.println("si devo emergere");
		}else{
			System.out.println("no no tutto apposto");
		}
	}

}
