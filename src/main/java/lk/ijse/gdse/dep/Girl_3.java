package lk.ijse.gdse.dep;

import lk.ijse.gdse.dep.GoodGirl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("properties")
public class Girl_3 implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love you from Girl_3");
    }
}
