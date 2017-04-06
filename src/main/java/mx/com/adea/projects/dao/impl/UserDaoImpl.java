package mx.com.adea.projects.dao.impl;

import mx.com.adea.projects.beans.User;
import mx.com.adea.projects.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Creado por visantillan el 16/03/2017.
 */

@Repository
public class UserDaoImpl implements UserDao {

  private final MongoOperations mongoOps;

  @Autowired
  public UserDaoImpl(MongoOperations mongoOps) {
    this.mongoOps = mongoOps;
  }

  @Override
  public List<User> getAllUsers() {

    boolean existe = mongoOps.collectionExists("apusers");

    if (existe) {
      List<User> list = mongoOps.findAll(User.class);
      return list;
    }

    return null;
  }
}
