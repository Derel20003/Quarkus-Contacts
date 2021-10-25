package com.contacts;

import com.contacts.namelist.Namelist;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/contacts")
public class Contacts {

    @Inject
    private Namelist namelist;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/add/{name}")
    public String addName(@PathParam("name") String someValue,
                          @QueryParam("language") String language) {
        return someValue + namelist.add(language);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/modify/{name}")
    public String greeting(@PathParam("name") String name) {
        return name;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/delete")
    public String hello5() {
        return "Hello RESTEasy3";
    }
}