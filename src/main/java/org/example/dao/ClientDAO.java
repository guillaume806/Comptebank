package org.example.dao;

import org.example.model.Client;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ClientDAO extends BaseDAO<ClientDAO> {

    public ClientDAO(Connection connection) {
        super(connection);
    }
    @Override
    public boolean save(Client element) throws SQLException {
        request = "INSERT INTO Client (client_id, solde_number, phone_number) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setString(3, element.getPhoneNumber());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }


    @Override
    public boolean update(Client element) throws SQLException {
        request = "UPDATE Client set (client_id, solde_number, phone_number) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setString(3, element.getPhoneNumber());
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public boolean delete(Client element) throws SQLException {
        request = "delete from client where id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getId(resultSet.getInt(1)));
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public ClientDAO get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<ClientDAO> get() throws SQLException {
        return null;
    }
}
