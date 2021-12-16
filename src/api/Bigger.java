package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.MediaType;

@Path("/")
public class Bigger {

	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnIndex()
	{
		return "<html>"+"<title>Next bigger number</title>"
				+"<body><h3>Next bigger number:</h3>"+"<form action=\"http://localhost:9090/myJavaAPI/bigger\" method=\"get\" >"
				+"<input type=\"number\" id=\"number\" name=\"number\"><br><br>"
				+ "    <input type=\"submit\" value=\"submit\" />"
				+ "</form>"
				+"</body></html>";
	}
	
	@GET
    @Path("bigger")
    @Produces("text/plain")
    public String returnResult(@QueryParam("number") int num) {
		String numbers = String.valueOf(num);
		char[] digits = numbers.toCharArray();
		String res=Methods.nextBigger(digits, digits.length);
        return res;
    }
}
