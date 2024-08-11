package lk.ijse.gdse.config;

import lk.ijse.gdse.aop.Logs;
import lk.ijse.gdse.beans.Customer;
import lk.ijse.gdse.beans.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This is a configuration class
@ComponentScan(basePackageClasses = {Customer.class, Logs.class})
//@ComponentScan(basePackages = "lk.ijse.gdse")  // This will scan the package for components
public class Config {

    @Bean // This is a bean method // This method will return an object // This object will be managed by the Spring Container
    // This method will return an object of the Order class
    public Order order(){
        return new Order();
    }


}
