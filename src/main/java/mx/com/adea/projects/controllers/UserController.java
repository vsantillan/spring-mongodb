package mx.com.adea.projects.controllers;

import mx.com.adea.projects.beans.User;
import mx.com.adea.projects.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Victor Santillán on 01/08/2016.
 * visantillan@adeamexico.com.mx
 */
@RestController
@RequestMapping("users")
public class UserController {

  private final UserDao userDao;

  private final Logger logger = LoggerFactory.getLogger(UserController.class);

  private final AtomicLong counter = new AtomicLong();

  @Autowired
  public UserController(UserDao greetingDao) {
    this.userDao = greetingDao;
  }

  @CrossOrigin
  @RequestMapping(value = "/getAllUsers.action", method = RequestMethod.GET)
  public List<User> getAllUsers(@RequestParam(value = "name", defaultValue = "World") String name) {
    List<User> usersList = userDao.getAllUsers();
    return usersList;
  }

  @CrossOrigin
  @RequestMapping(value = "/deleteUser.action", method = RequestMethod.DELETE)
  public void deleteUser(@RequestParam(value = "login", defaultValue = "World") String login) {
    logger.debug("Eliminado");
    logger.debug(login);
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