package ec.clicka.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    Records: Eliminate verbosity in creating Java Beans. Public accesor methods,
    constructor, equals, hashcode and toString are automatically created.
    Released in JDK 16.
 */
record Person (String name, int age) { }
record Address(String firstLine, String city) { }

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Ranga";
    }

    @Bean
    public int age() {
        return 15;
    }

    @Bean
    public Person person() {
        return new Person("Ravi", 20);
    }

    @Bean
    public Address address() {
        return new Address("Baker Street", "London");
    }

}
