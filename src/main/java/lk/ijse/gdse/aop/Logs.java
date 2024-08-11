package lk.ijse.gdse.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logs {
    @Before("execution(public void startTransaction())")
    public  void logsForStartTransaction(){
        System.out.println("Logs for Transaction Started");
    }

    @Before("execution(public void endTransaction())")
    public  void logsForendTransaction(){
        System.out.println(" Logs for Transaction Ended");
    }
}
