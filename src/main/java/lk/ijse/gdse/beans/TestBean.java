package lk.ijse.gdse.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component("testBean") // apit onam nmk dennt puluwn nttnm default clz name eka gnnw (Ex: testbean)
public class TestBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory : " + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name : " + name);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroyed...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean Initialized...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context : " + applicationContext);
    }

    @PreDestroy
    public void customerDestroyTest(){
        System.out.println("Customer Destroy Method Invoked...");
    }
}
