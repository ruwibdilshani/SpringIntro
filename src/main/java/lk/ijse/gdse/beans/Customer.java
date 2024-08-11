package lk.ijse.gdse.beans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("customer") // This is a component class
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Customer {
    public Customer() {
        System.out.println("Customer Bean Instantiated...");
    }

}


//this is bean class