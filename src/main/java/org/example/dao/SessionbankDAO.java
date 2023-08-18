package org.example.dao;

import org.example.model.Sessionbank;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SessionbankDAO extends BaseDAO<Sessionbank> {

    public SessionbankDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Sessionbank element) throws SQLException {
        return false;
    }

//    @Override
//    public boolean deposit( element) throws SQLException {
//        request = "INSERT INTO Session_bank (first_name, last_name) VALUES (?,?)";
//        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
//        statement.setString(1, element.getFirstName());
//        statement.setString(2, element.getLastName());
//        int nbRows = statement.executeUpdate();
//        resultSet = statement.getGeneratedKeys();
//        if(resultSet.next()){
//            element.setId(resultSet.getInt(1));
//        }
//        return nbRows == 1;
//    }

    @Override
    public boolean update(Sessionbank element) throws SQLException {
        request = "UPDATE Session_bank set solde_number = ?";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,element.getFirstName());

        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public boolean delete(Sessionbank element) throws SQLException {
        request = "delete from session_bank where id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getId());
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public Sessionbank get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Sessionbank> get() throws SQLException {
        return null;
    }

//    @Override
//    public boolean delete(Person element) throws SQLException {

//    }
//
//    @Override
//    public Person get(int id) throws SQLException {
//        Person person = null;
//        request = "select * from person where id = ?";
//        statement = _connection.prepareStatement(request);
//        statement.setInt(1, id);
//        resultSet = statement.executeQuery();
//        if(resultSet.next()) {
//            person = new Person(resultSet.getInt("id"),
//                    resultSet.getString("first_name"),
//                    resultSet.getString("last_name"));
//        }
//        return person;
//    }
//
//    @Override
//    public List<Person> get() throws SQLException {
//        List<Person> result = new ArrayList<>();
//        request = "select * from person";
//        statement = _connection.prepareStatement(request);
//        resultSet = statement.executeQuery();
//        while(resultSet.next()){
//            Person person = new Person(resultSet.getInt("id"),
//                    resultSet.getString("first_name"),
//                    resultSet.getString("last_name"));
//            result.add(person);
//        }
//        return result;
//    }

}
