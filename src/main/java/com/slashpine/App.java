package com.slashpine;

import com.google.gson.Gson;
import com.slashpine.data.PersonDao;
import com.slashpine.data.PersonDaoImpl;
import com.slashpine.data.PersonDaoMock;
import com.slashpine.models.Person;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PersonDao personDao = new PersonDaoImpl();
        Gson gson = new Gson();


        port(8080);

        get("/hello", (req, res) -> "<h1>Hello World</h1>");

        get("/people", (req, resp) -> gson.toJson(personDao.getPeople()));

        post("/people", (req, resp) -> {

            String firstName = req.queryParams("firstName");
            String lastName = req.queryParams("lastName");
            String email = req.queryParams("email");

            Person person = new Person(0, firstName, lastName, email);

            return gson.toJson(personDao.addPerson(person));
        });

        get("/people/:id", (req, resp) -> {

            Person person = personDao.getPersonById(Integer.parseInt(req.params(":id")));

            return gson.toJson(person);
        });





    }
}
