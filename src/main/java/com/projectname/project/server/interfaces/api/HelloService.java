package com.projectname.project.server.interfaces.api;

/**
 * Created by roger on 15/07/15.
 */

import com.google.gwt.core.client.GWT;
import com.projectname.project.shared.domain.Hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Path("hellos")
public class HelloService {

    Map<String, Hello> database;

    public HelloService() {
        database = new HashMap<String, Hello>();
        Hello hello1 = new Hello("1", "ronan");
        Hello hello2 = new Hello("2", "john");
        Hello hello3 = new Hello("3", "roger");
        Hello hello4 = new Hello("4", "romy");
        Hello hello5 = new Hello("5", "batman");

        database.put(hello1.getId(), hello1);
        database.put(hello2.getId(), hello2);
        database.put(hello3.getId(), hello3);
        database.put(hello4.getId(), hello4);
        database.put(hello5.getId(), hello5);
    }

    @GET
    @Produces("application/json")
    public Collection<Hello> get() {
        GWT.log("Size: " + database.values().size());
        System.out.println("Size: " + database.size());
        return database.values();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Hello getHello(@PathParam("id") String id) {
        return database.get(id);
    }
}