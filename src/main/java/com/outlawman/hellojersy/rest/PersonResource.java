package com.outlawman.hellojersy.rest;

import com.outlawman.hellojersy.bean.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@Path("/persons")
public class PersonResource {

    @GET
    @Path("/fox")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersonByName() {
        Person me = new Person("Fox", "Mulder", 35);
        return Response.status(200).entity(me).build();
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPersons() {
        Person fox = new Person("Fox", "Mulder", 35);
        Person dana = new Person("Dana", "Scally", 30);
        Person jack = new Person("Jack", "Bouare", 45);
        Person tony = new Person("Tony", "Stark", 33);
        List<Person> persons = new ArrayList<>();
        persons.add(fox);
        persons.add(dana);
        persons.add(jack);
        persons.add(tony);

        return Response.status(200).entity(persons).build();
    }
}
