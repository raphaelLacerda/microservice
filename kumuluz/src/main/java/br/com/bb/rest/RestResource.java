package br.com.bb.rest;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/teste")
public class RestResource {

	@PersistenceContext(unitName = "jpa")
	private EntityManager	em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getResources() {

		Map<String, String> json = new HashMap<>();
		json.put("framework", "KumuluzEE");
		json.put("em", em.toString());

		System.out.println(em);
		
		return Response.ok(json).build();
	}
}