package lk.ijse.gdse.dep;

import lk.ijse.gdse.Wow;
import lk.ijse.gdse.dep.GoodGirl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("properties")
@Wow //Custom Annotation
public class Girl_4 implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love you from Girl_4");
    }
}
