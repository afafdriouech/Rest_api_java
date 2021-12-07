package api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/")
public class ApplicationClass extends ResourceConfig{
	
	public ApplicationClass() {
		packages("api");
	}
}

