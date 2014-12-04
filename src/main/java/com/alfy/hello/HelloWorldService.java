package com.alfy.hello;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {
  @GET
  @Produces("text/plain")
  public String getClichedMessage() {
    return "Hello World";
  }

  @GET
  @Path("/stuff")
  @Produces("application/json")
  public Json getStuff() {
    return new Json("This is a message.");
  }

  @POST
  @Consumes("application/json")
  public Response postStuff(@QueryParam("queryParam") String queryParam,
                            Json json) {
    // TODO use the post body
    System.out.println(json.getMessage());

    return Response.created(null).build();
  }
}