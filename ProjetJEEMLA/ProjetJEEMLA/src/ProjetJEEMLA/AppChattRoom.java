package ProjetJEEMLA;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/projetAppchatt")
@Produces("application/json")
public class AppChattRoom {
	 private static Map<Integer, String> memoire = new HashMap<>();
     @GET
		public Map<Integer, String> getValue() {
			return memoire;
		}
 @PUT
		@Consumes("application/json")
		public void insert(AppChatt data) {
			System.out.println("valeur recu id:" + data.id + " message:" + data.message +" name:"+ data.name+" date:"+ data.date+" lieu:"+ data.lieu);
			System.out.println("taille memoire avant ajout:" + memoire.size());
			memoire.put(data.id, data.message);
		}
	

}
