package com.revature.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;

@Path("trainer")
@Api(value="trainer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TrainerResources {
	
	public Response getPendingAssociates() {
		return null;
		
	}
	
}
