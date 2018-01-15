package ProjetJEEMLA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/meme")
@Produces("application/json")


public class essai2chat {
	

	List<Donnes> list = new ArrayList();

	private static Map<String, List<Donnes>> memoire = new HashMap<>();

	@GET
	public Map<String, List<Donnes>> getValue() {

		return memoire;
	}

	@PUT
	public void insert(List<Donnes> list) {

		memoire.put(null, list);

	}
}

