package pattern;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventManager {

	 Map<String, List<EstadoDoBolo>> estadoDoBolo = new HashMap<>();

	    public EventManager(String... operations) {
	        for (String operation : operations) {
	            this.estadoDoBolo.put(operation, new ArrayList<>());
	        }
	    }

	    public void subscribe(String eventType, EstadoDoBolo listener) {
	        List<EstadoDoBolo> users = estadoDoBolo.get(eventType);
	        users.add(listener);

	    }

	    public void unsubscribe(String eventType, EstadoDoBolo listener) {
	        List<EstadoDoBolo> users = estadoDoBolo.get(eventType);
	        users.remove(listener);
	    }

	    public void notify(String eventType) {

	        List<EstadoDoBolo> users = estadoDoBolo.get(eventType);
	        for (EstadoDoBolo listener : users) {
	            listener.update(eventType);

	        }
	    }	
}
