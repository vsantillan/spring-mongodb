package mx.com.adea.lexa.beans;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * Creado por visantillan el 17/03/2017.
 */
@Document(collection = "lexa")
public class OtherUser implements Serializable {

	@Id
	private String id;
	private String content;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
