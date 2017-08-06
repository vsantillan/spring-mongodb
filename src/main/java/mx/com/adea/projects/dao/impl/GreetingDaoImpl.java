package mx.com.adea.projects.dao.impl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;
import mx.com.adea.projects.beans.Greeting;
import mx.com.adea.projects.beans.OtherUser;
import mx.com.adea.projects.dao.GreetingDao;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Creado por visantillan el 16/03/2017.
 */

@Repository
public class GreetingDaoImpl implements GreetingDao {

  private final MongoOperations mongoOps;

  @Autowired
  public GreetingDaoImpl(MongoOperations mongoOps) {
    this.mongoOps = mongoOps;
  }

  @Override
  public void create(Greeting p) {
//		UUID uuid = UUID.randomUUID();
//		String randomUUIDString = uuid.toString();

    ObjectId objectId = ObjectId.get();

    BasicDBObject dbObject = new BasicDBObject();

    DBObject doc =
        (DBObject) JSON.parse("{\"id\":\"58d936539ce54a156f3da4ae\",\"content\":\"Hello, Nyla!\"}");

    //DBObject dbObject1 = (DBObject) JSON.parse("hello");
    DBCollection cursor = mongoOps.getCollection("projects");

    boolean existe = mongoOps.collectionExists("projects");
    mongoOps.insert(p, "projects");
    List<OtherUser> list = mongoOps.findAll(OtherUser.class);
    System.out.println(existe);
  }

  @Override
  public Greeting readById(String id) {
    return null;
  }

  @Override
  public void update(Greeting p) {
  }

  @Override
  public int deleteById(String id) {
    return 0;
  }
}
