package mx.com.adea.projects.dao.impl;

import mx.com.adea.projects.beans.Greeting;
import mx.com.adea.projects.beans.OtherUser;
import mx.com.adea.projects.dao.GreetingDao;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
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

		boolean existe = mongoOps.collectionExists("projects");
		p.setId(objectId.toString());
		p.setContent("Holaaaaaaaaa");
		mongoOps.insert(p, "projects");
		List<OtherUser> list = mongoOps.findAll(OtherUser.class);
		System.out.println(existe);
	}

	@Override
	public Greeting readById(String id) {
		return null;
	}

	@Override
	public void update(Greeting p) {}

	@Override
	public int deleteById(String id) {
		return 0;
	}
}
