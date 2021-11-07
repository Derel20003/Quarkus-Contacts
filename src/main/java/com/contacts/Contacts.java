package com.contacts;

import com.contacts.namelist.Namelist;
import com.contacts.saveablenamelist.SavableNamelist;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/contacts")
public class Contacts {

    @Inject
    Namelist namelist;
    @Inject
    SavableNamelist savableNamelist;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/namelist/{action}")
    public String namelist(@PathParam("action") String action,
                           @QueryParam("name") String name,
                           @QueryParam("newName") String newName) {
        return namelist.tryAction(action, name, newName);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/savableNamelist/{action}")
    public String savableNamelist(@PathParam("action") String action,
                           @QueryParam("name") String name,
                           @QueryParam("newName") String newName) {
        return savableNamelist.tryAction(action, name, newName);
    }
}