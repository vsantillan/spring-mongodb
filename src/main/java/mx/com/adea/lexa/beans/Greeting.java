package mx.com.adea.lexa.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Creado por Administrador on 17/01/2017.
 */
@XmlRootElement(name = "Greeting")
public class Greeting {
	private String id;
	private String content;

	public Greeting() {
	}

	public Greeting(String id, String content) {
		this.id = id;
		this.content = content;
	}

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
