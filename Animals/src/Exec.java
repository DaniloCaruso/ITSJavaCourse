
public class Exec {

	public static void main(String[] args) {
		Animale ghepardo = new Animale();
		
		ghepardo.setRazza("Ghepardo");
		ghepardo.setColore("maculato");
		ghepardo.setSesso("Marchio");

		System.out.println(" Animale:" + ghepardo.razza + " Sesso:" + ghepardo.getSesso() + " Colore:"+ ghepardo.colore);
		
	}

}
