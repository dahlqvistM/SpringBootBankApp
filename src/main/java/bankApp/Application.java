package bankApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
    	System.out.println("Accessed main and started");
        SpringApplication.run(Application.class, args);
    }
  
}

