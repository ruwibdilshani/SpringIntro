package lk.ijse.gdse;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Qualifier
@Retention(RetentionPolicy.RUNTIME) // This annotation is used to indicate that this annotation should be available at runtime
public @interface Wow {
}
