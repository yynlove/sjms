package zhujie;

import java.lang.annotation.*;

/**
 *
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface People {
    Game[] value() ;
}

