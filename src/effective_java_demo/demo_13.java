package effective_java_demo;

public class demo_13 implements Cloneable{
    private Object[] elements;
    private int size =0;
    private static final int final_size = 16;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        final demo_13 clone = (demo_13) super.clone();
        clone.elements = elements.clone();
        return clone;
    }
}
