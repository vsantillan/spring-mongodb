package mx.com.adea.projects.model;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Creado por visantillan el 17/03/2017.
 */
@Document(collection = "users")
public class User implements Serializable{

	@Id
	private String id;
	private String username;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
