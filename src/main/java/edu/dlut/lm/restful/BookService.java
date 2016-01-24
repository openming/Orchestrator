package edu.dlut.lm.restful;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("book")
public class BookService {
	
	@GET
	@Produces("text/plain")
	public String getIt() {
		return "hello";
	}
	
	@GET
	@Path("/json")
	@Produces({ MediaType.APPLICATION_JSON })
	public HashMap<String, String> getClientedMessage() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("abc", "def");
		return map;
	}
}
