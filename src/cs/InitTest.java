package cs;

public class InitTest {


    /**
     * 初始化顺序：
     * ① 父类静态代码块和静态变量。
     * ② 子类静态代码块和静态变量。
     * ③ 父类普通代码块和普通变量。
     * ④ 父类构造方法。
     * ⑤ 子类普通代码块和普通变量。
     * ⑥ 子类构造方法。
     * @param args
     */
    public static void main(String[] args) {
        final zi zi = new zi();

        zi.AA();
    }


    static class fu{
        static {
            System.out.println("父 静态 代码块");
        }

        {
            System.out.println("父 代码块");
        }

        public fu() {
            System.out.println("父 构造方法");
        }

        private String fu_AA;


        public void AA(){
            System.out.println("父 AA");
        }

    }


    static class zi extends fu{
        static {
            System.out.println("子 静态 代码块");
        }
        {
            System.out.println("子 代码块");
        }

        public zi() {
            System.out.println("子 构造方法");
        }

        private String zi;

        @Override
        public void AA() {
            System.out.println("子 AA");
        }
    }



}
