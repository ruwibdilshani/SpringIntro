package lk.ijse.gdse.dep;

import lk.ijse.gdse.dep.GoodGirl;
import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love you from Girl");
    }
}
