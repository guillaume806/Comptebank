package org.example.dao;

import org.example.model.Operate;
import org.example.model.Sessionbank;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class OperateDAO extends BaseDAO<Operate> {

    public OperateDAO(Connection connection) {
        super(connection);
    }
    @Override
    public boolean save(Operate element) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Operate element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Operate element) throws SQLException {
        return false;
    }

    @Override
    public Operate get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Operate> get() throws SQLException {
        return null;
    }
}
