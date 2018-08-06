package MySpringBootquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBoot {
    public static void main(String[] args)    {

//Set up default configuration
//Starts Spring Application Context
//Performs Class path scan
//Starts Tomcat Server
        SpringApplication.run(MySpringBoot.class,args);

    }
}
