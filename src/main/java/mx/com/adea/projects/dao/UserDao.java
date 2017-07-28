package mx.com.adea.projects.dao;

import mx.com.adea.projects.beans.User;

import java.util.List;

/**
 * Creado por visantillan el 16/03/2017.
 */
public interface UserDao {

  List<User> getAllUsers();

  void inserUser(User user);

}
