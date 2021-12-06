package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class Bigger {

	@GET
    @Path("/bigger")
    @Produces("text/plain")
    public int nextBigger() {
           return 1;
    }
}
