package de.beyondjava.rest.restEasyGettingStarted;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("users")
@Produces(MediaType.APPLICATION_XML)
public class UserResource {

   @Path("{id}")
   @DELETE
   public Response deleteUser(@PathParam("id") Integer id) {
      MockUserTable.delete(id);
      return Response.ok("<status>success<status>").build();
   }

   @Path("")
   @GET
   public Response getUsersXML() {
      List<User> users = MockUserTable.getAll();
      GenericEntity<List<User>> ge = new GenericEntity<List<User>>(users) {
      };
      return Response.ok(ge).build();
   }

   @Path("{id}")
   @GET
   public Response getUserXMLById(@PathParam("id") Integer id) {
      return Response.ok(MockUserTable.getById(id)).build();
   }

   @Path("")
   @POST
   public Response saveUser(User user) {
      MockUserTable.save(user);
      return Response.ok("<status>success<status>").build();
   }

}