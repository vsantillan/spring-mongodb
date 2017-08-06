package mx.com.adea.lexa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by visantillan on 06/04/2017.
 * +
 */
@Controller
public class OptionsController {

  @RequestMapping(value = "/**", method = RequestMethod.OPTIONS)
  public void corsHeaders(HttpServletResponse response) {
    response.addHeader("Access-Control-Allow-Origin", "*");
    response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
    response.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, x-requested-with");
    response.addHeader("Access-Control-Max-Age", "3600");
  }

}
