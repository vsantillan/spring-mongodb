package mx.com.adea.lexa.beans;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Victor Santillán on 05/04/2017.
 * visantillan@adeamexico.com.mx
 */
@Document(collection = "apusers")
@XmlRootElement(name = "Users")
public class User implements Serializable{

  @Id
  private String login;
  private String nombre;
  private String area;
  private char estatus;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public char getEstatus() {
    return estatus;
  }

  public void setEstatus(char estatus) {
    this.estatus = estatus;
  }
}
