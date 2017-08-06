package mx.com.adea.projects.controllers;

import mx.com.adea.projects.beans.User;
import mx.com.adea.projects.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Victor Santillán on 01/08/2016.
 * visantillan@adeamexico.com.mx
 */
@RestController
@CrossOrigin(origins = "http://localhost:1841", maxAge = 3600)
@RequestMapping("users")
public class UserController {

  private final Logger logger = LoggerFactory.getLogger(UserController.class);
  private final UserDao userDao;

  @Autowired
  public UserController(UserDao greetingDao) {
    this.userDao = greetingDao;
  }

  @RequestMapping(value = "/getAllUsers.action", method = RequestMethod.GET)
  public List<User> getAllUsers(@RequestParam(value = "name", defaultValue = "World") String name) {
    return userDao.getAllUsers();
  }

  @RequestMapping(value = "/deleteUser.action/{login}", method = RequestMethod.DELETE)
  public @ResponseBody
  void deleteUser(@PathVariable String login) {
    System.out.println("Hola");
    logger.debug("Eliminado");
    logger.debug(login);
  }

  @RequestMapping(value = "/updateUser.action", method = RequestMethod.POST)
  public ResponseEntity updateUser(@RequestBody User user) {
    logger.debug("Eliminado");
    logger.debug(user.getLogin());
    User usuario = new User();
    Map<String, User> result = new HashMap<>();
    usuario.setLogin("aryaz");
    usuario.setNombre("nombre completo");
    usuario.setArea("DAT");
    usuario.setEstatus('A');
    result.put("user", usuario);
    return new ResponseEntity<>(result, HttpStatus.OK);
  }
  
//	@CrossOrigin
//	@RequestMapping(value = "/testmap.action")
//	public Map<String, ?> testMap(@RequestParam(value = "name", defaultValue = "World") String name) {
//		Map<String, Greeting> map = new HashMap<>();
//
//		map.put("greeting", new Greeting(counter.incrementAndGet(), String.format(template, name)));
//		map.put("greeting2", new Greeting(counter.incrementAndGet(), String.format(template, name)));
//		map.put("greeting3", new Greeting(counter.incrementAndGet(), String.format(template, name)));
//
//		return map;
//	}
}
