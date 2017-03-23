package mx.com.adea.projects.dao;

import mx.com.adea.projects.beans.Greeting;

/**
 * Creado por visantillan el 16/03/2017.
 */
public interface GreetingDao {

	void create(Greeting p);

	Greeting readById(String id);

	void update(Greeting p);

	int deleteById(String id);

}
