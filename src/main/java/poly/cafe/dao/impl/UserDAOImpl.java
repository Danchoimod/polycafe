package poly.cafe.dao.impl;

import java.util.List;
import poly.cafe.dao.UserDAO;
import poly.cafe.entity.User;
import poly.cafe.util.*;

public class UserDAOImpl implements UserDAO {

    String createSql = "INSERT INTO Users(Username, Password, Enabled, Fullname, Photo, Manager) VALUES (?, ?, ?, ?, ?, ?)";
    String updateSql = "UPDATE Users SET Password=?, Enabled=?, Fullname=?, Photo=?, Manager=? WHERE Username=?";
    String deleteSql = "DELETE FROM Users WHERE Username=?";
    String findAllSql = "SELECT * FROM Users";
    String findByIdSql = "SELECT * FROM Users WHERE Username=?";

    @Override
    public User create(User entity) {
        Object[] values = {
            entity.getUsername(),
            entity.getPassword(),
            entity.isEnabled(),
            entity.getFullname(),
            entity.getPhoto(),
            entity.isManager()
        };
        XJdbc.executeUpdate(createSql, values);
        return entity;
    }

    @Override
    public void update(User entity) {
        Object[] values = {
            entity.getPassword(),
            entity.isEnabled(),
            entity.getFullname(),
            entity.getPhoto(),
            entity.isManager(),
            entity.getUsername()
        };
        XJdbc.executeUpdate(updateSql, values);
    }

    @Override
    public List<User> findAll() {
        return XQuery.getBeanList(User.class, findAllSql);
    }

    @Override
    public User findById(String id) {
        return XQuery.getSingleBean(User.class, findByIdSql, id);
    }

    @Override
    public void DeleteById(String id) {
        XJdbc.executeUpdate(deleteSql, id);
    }
}
