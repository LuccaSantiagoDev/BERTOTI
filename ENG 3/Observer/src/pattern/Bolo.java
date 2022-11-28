package pattern;

public class Bolo {
	public EventManager events;

	public Bolo() {
		
	this.events = new EventManager("Pronto","Cru","Queimado") ;
	}
	
	
	public void BoloPronto() {
		events.notify("Pronto");
	}
	public void BoloCru() {
		events.notify("Cru");
	}
	public void BoloQueimado() {
		events.notify("Queimado");
	}

}
