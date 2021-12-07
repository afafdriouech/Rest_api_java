package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/")
public class Bigger {

	@GET
    @Path("/bigger")
    @Produces("text/plain")
    public String nextBigger(@QueryParam("number") int num) {
		
		String numbers = String.valueOf(num);
        return numbers;
    }
}
