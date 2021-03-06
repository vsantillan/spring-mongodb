package mx.com.adea.lexa.dao.impl;

import com.mongodb.DBCollection;
import mx.com.adea.lexa.beans.User;
import mx.com.adea.lexa.dao.UserDao;
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
      return mongoOps.findAll(User.class);
    }

    return null;
  }

  @Override
  public void insertUser(User user) {
    DBCollection collection = mongoOps.getCollection("apusers");


  }
}
