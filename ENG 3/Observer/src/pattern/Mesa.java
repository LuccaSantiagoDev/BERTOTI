package pattern;

public class Mesa implements EstadoDoBolo{

	@Override
	public void update(String eventType) {
System.out.println(eventType);		
	}

}
