package lk.ijse.gdse;

import lk.ijse.gdse.beans.TestBean;
import lk.ijse.gdse.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext();
    ctx.register(Config.class);
    ctx.refresh();
    TestBean testBean=(TestBean)ctx.getBean("testBean");
    ConfigurableBeanFactory beanFactory =ctx.getBeanFactory();
    boolean isSingletonCustomer = beanFactory.isSingleton("testBean");
        System.out.println(testBean);
        System.out.println("Is Test Singleton:" +isSingletonCustomer);
    ctx.registerShutdownHook();
    }
}



/*--------------CONTEXT TYPES----------------*/
//• AnnotationConfigurationApplicationContext – Configs from annotations
//• ClassPathXMLApplicationContext - Based on an internal source
//• FIleSystemXMLAppicationContext - Based on an external source
//• AnnotationConfigurationWebApplicationContext - Get configs from
//Annotations (Specialized to web apps)
//• XMLWebApplicationContext - Get configs from XML