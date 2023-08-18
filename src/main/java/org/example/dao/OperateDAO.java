package org.example.dao;

import org.example.model.Operate;
import org.example.model.Sessionbank;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class OperateDAO extends BaseDAO<Operate> {

    public OperateDAO(Connection connection) {
        super(connection);
    }
    @Override
    public boolean save(Operate element) throws SQLException {
        request = "INSERT INTO Operation (session_id, rising_number, statut_title) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getSessionID());
        statement.setInt(2, element.getRising());
        statement.setInt(2, element.getType());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Operate element) throws SQLException {
        request = "UPDATE Operation set rising_number = ?";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1,element.getRising());

        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public boolean delete(Operate element) throws SQLException {
        request = "delete from Operation where id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1, element.getId(resultSet.getInt(1)));
        int nbRow = statement.executeUpdate();
        return nbRow ==1;
    }

    @Override
    public Operate get(int id) throws SQLException {

    }

    @Override
    public List<Operate> get() throws SQLException {
        return null;
    }
}
