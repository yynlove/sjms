package effective_java_demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class demo_15 {

    private static final Object[] A_A= {1,2,3};
    //1
    public static final List<Object> values = Collections.unmodifiableList(Arrays.asList(A_A));
    //2
    public static final Object[] values(){
        return A_A.clone();
    }

}
