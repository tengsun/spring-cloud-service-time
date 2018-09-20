package st.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoServiceTimeApplication {
	
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String currTime() {
		return (new Date()).toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoServiceTimeApplication.class, args);
	}
}
