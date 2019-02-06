package com.slashpine.data;

import com.slashpine.models.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public List<Person> getPeople() {
        Connection conn = null;
        List<Person> people = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/coffee?user=coffee&password=coffee");

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM people;");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");

                people.add(new Person(id, firstName, lastName, email));
            }


        } catch (Exception ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
        }

        return people;
    }

    @Override
    public Person addPerson(Person person) {
        return null;
    }
}
