package itis.repository;

import itis.models.User;

import java.sql.SQLException;

public interface AccountsRepository {

    void save(User user) throws SQLException;
}
