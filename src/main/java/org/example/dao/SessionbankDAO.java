package org.example.dao;

import org.example.model.Sessionbank;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class SessionbankDAO extends BaseDAO<Sessionbank> {

    public SessionbankDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Sessionbank element) throws SQLException {
        request = "INSERT INTO session_bank (client_id, solde_number) VALUES (?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getSolde());
        statement.setInt(2, element.getClientID());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }


    @Override
    public boolean update(Sessionbank element) throws SQLException {
        request = "UPDATE Session_bank set solde_number = ?";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1,element.getSolde());

        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public boolean delete(Sessionbank element) throws SQLException {
        request = "delete from session_bank where id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getId(resultSet.getInt(1)));
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public Sessionbank get(int id) throws SQLException {
        Sessionbank sessionbank = null;
        request = "select * from session_bank where id_client = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, id);
        resultSet = statement.executeQuery();
        if(resultSet.next()) {
            sessionbank = new Sessionbank(resultSet.getInt("id"),
                    resultSet.getDouble("solde_number");
        }
        return person;
    }

    @Override
    public List<Sessionbank> get() throws SQLException {
        return null;
    }



}
