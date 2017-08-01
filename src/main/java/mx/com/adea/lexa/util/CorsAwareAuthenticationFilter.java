package mx.com.adea.lexa.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by visantillan on 06/04/2017.
 * +
 */
@Component
class CorsAwareAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
  static final String ORIGIN = "Origin";

  @Override
  public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
    if(!request.getHeader(ORIGIN).equals("")){
      String origin = request.getHeader(ORIGIN);
      response.addHeader("Access-Control-Allow-Origin", origin);
      response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
      response.addHeader("Access-Control-Allow-Credentials", "true");
      response.addHeader("Access-Control-Allow-Headers",
          request.getHeader("Access-Control-Request-Headers"));
    }
    if(request.getMethod().equals("OPTIONS")) {
      try {
        response.getWriter().print("OK");
        response.getWriter().flush();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return super.attemptAuthentication(request, response);
  }
}
