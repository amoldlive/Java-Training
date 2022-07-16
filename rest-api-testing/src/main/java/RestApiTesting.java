import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class RestApiTesting {
	public static void main(String[] args) {
		RestTemplate restTemplate=new RestTemplate();
		
		 HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<String> entity = new HttpEntity<String>(headers);
	      
	      String resposen=
	       restTemplate.exchange(
	         "http://localhost:8080/getalluser", HttpMethod.GET, entity, String.class).getBody();
	 	  
	      System.out.println(resposen);
	}
}
