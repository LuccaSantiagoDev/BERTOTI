package pattern;

public class Forno implements EstadoDoBolo{

	@Override
	public void update(String eventType) {
		System.out.println("www"+eventType);		
		
	}

}
