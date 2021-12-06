package api;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class ApplicationClass extends ResourceConfig{
	
	public ApplicationClass() {
		packages("api");
	}

}
