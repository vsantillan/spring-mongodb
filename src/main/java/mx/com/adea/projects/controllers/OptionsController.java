package mx.com.adea.projects.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by visantillan on 06/04/2017.
 * +
 */
@Controller
public class OptionsController {

  @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
  public ResponseEntity handle() {
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }

}
