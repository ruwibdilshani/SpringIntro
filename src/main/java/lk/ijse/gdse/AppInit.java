package lk.ijse.gdse;

import lk.ijse.gdse.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
    var ctx = new AnnotationConfigApplicationContext();
    ctx.register(Config.class);
    ctx.refresh();
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