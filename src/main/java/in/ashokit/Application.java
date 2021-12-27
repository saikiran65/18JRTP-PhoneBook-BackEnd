package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
//@CrossOrigin(origins = "http://localhost:4200" )
@CrossOrigin(origins = "https://aqueous-spire-28712.herokuapp.com")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	
}
