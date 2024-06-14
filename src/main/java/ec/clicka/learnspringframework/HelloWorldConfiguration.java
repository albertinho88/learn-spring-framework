package ec.clicka.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    Records: Eliminate verbosity in creating Java Beans. Public accesor methods,
    constructor, equals, hashcode and toString are automatically created.
    Released in JDK 16.
 */
record Person (String name, int age, Address Address) { }
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
        return new Person("Ravi", 20, new Address("Baker Street", "London"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("Baker Street", "London");
    }

    @Bean(name = "address3")
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }

}
