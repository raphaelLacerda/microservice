package br.com.bb.jpa;

import java.util.Random;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/usuarios")
public class UsuarioResource {

	@Inject
	private TodosUsuarios todosUsuarios;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar() {

		todosUsuarios.salvar(new Usuario("Novo usuario " + new Random().nextInt()));

		return Response.ok(todosUsuarios.listar()).build();
	}
}
