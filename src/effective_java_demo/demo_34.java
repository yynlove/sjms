package effective_java_demo;


import java.io.Serializable;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;

interface Operation{
    public  double apply(double x,double y);
}
public enum  demo_34 implements Operation {


    plus("+") {
        @Override
        public double apply(double x, double y){return x+y;}},
    minus("-") {
        @Override
        public double apply(double x, double y){return x-y;}};
    private final String fuhao;

    demo_34(String fuhao) {
        this.fuhao = fuhao;
    }


    static class EnumSetDemo{

        public static void main(String[] args) {

            final EnumSet<demo_34> demo_34s = EnumSet.allOf(demo_34.class);
            System.out.println(demo_34s);
            final EnumSet<demo_34> set = EnumSet.of(plus, minus);
            System.out.println(set);
        }
    }

    static class EnumMapDemo{


        public static void main(String[] args) {

            //映射键
            final EnumMap<demo_34, Object> demo_34ObjectEnumMap = new EnumMap<>(demo_34.class);





        }

    }








}
