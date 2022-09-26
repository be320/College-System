package com.dataserve;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Path("/CollegeService")
@ApplicationPath("/resources")
public class CollegeService extends Application {
	
	// http://localhost:8080/CollegeDemo/resources/CollegeService/sayHello
	@GET
	@Path("/sayHello")
	public String getHelloMessage() {
		return "Hello";
	}

}
