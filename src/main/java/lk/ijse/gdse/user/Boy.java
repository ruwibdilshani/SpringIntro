package lk.ijse.gdse.user;

import jakarta.annotation.PostConstruct;

import lk.ijse.gdse.Wow;
import lk.ijse.gdse.dep.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Boy {
/*
    @Autowired
    @Qualifier("properties")
    @Wow *///Custom Annotation
    private GoodGirl goodGirl;

   /* @Autowired
    @Wow
    public Boy(GoodGirl goodGirl){
       this.goodGirl=goodGirl;
    }*/

    //----------------Setter injection---------------
    @Autowired
    @Wow
    public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

    @PostConstruct // This annotation is used to indicate that this method should be executed after the instantiation of the bean
    public void init(){
//        System.out.println(goodGirl);
        goodGirl.love();

    }

    @Autowired
    public void myMethod(@Nullable String name){
        System.out.println("Hello Null : "+name);
    }
}
