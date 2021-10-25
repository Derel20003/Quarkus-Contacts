package com.contacts.namelist;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class Namelist {

    public String add(String name){
        return name + "22";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/add")
    public String hello() {
        return "Hello RESTEasy1";
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
