package pattern;

public class main {

	public static void main(String[] args) {

		Bolo bolo = new Bolo();
		
		bolo.events.subscribe("Cru",new Forno());
		bolo.events.subscribe("Cru",new Mesa());

		
		bolo.BoloPronto();
		bolo.BoloQueimado();
	}

}
