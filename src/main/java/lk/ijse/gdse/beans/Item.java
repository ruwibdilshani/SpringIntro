package lk.ijse.gdse.beans;

import org.springframework.stereotype.Component;

@Component // This is a component class // This class will be managed by the Spring Container
// This class will be instantiated by the Spring Container
public class Item {
    public Item() {
        System.out.println("Item Bean Instantiated...");
    }
}


//this is bean class