package ProjetJEEMLA;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;   

@Path("/mem")
@Produces("application/json")

public class Essaichat1 {
private static Map<String, String> memoire = new HashMap<>();
	
	@GET
	public Map<String, String> getValue() {
		
	return memoire;
	}
	
		
	@PUT
	public void insert(@QueryParam("name")
	String name, @QueryParam("val") String val) {
	
	memoire.put(name, val);
	
	
}

}
