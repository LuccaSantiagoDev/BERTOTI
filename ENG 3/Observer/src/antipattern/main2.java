package antipattern;

public class main2 {

	public static void main(String[] args) {

		
		Bolo bolo = new Bolo("Cru");
		
		Mesa mesa = new Mesa();
		Forno forno = new Forno();
		mesa.setEstadoDoBolo(bolo.getEstadoDoBolo());
		forno.setEstadoDoBolo(bolo.getEstadoDoBolo());

		
		
		
		
		
		}

}
