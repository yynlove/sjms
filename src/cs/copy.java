package cs;

public class copy {

    public static void main(String[] args) throws CloneNotSupportedException {

        qiankaobei();
        //深拷贝1 使用clone
        shenkaobei_1();
        //深拷贝2 使用构造方法
        shenkaobei_2();


    }

    /**
     * 深拷贝
     */
    private static void shenkaobei_2() {
        final BB bb3 = new BB("bb3", 33);
        final CC cc3 = new CC("cc3", 111,bb3);
        final CC cc1 = new CC(cc3);
        System.out.println(cc3.toString());
        cc1.getBb().setbName("cloneBB3");
        System.out.println(cc1.toString());
    }

    private static void shenkaobei_1() throws CloneNotSupportedException {
        final BB bb2 = new BB("bb2", 22);
        final CC cc = new CC("cc",11, bb2);
        final CC clone1 = (CC) cc.clone();
        clone1.getBb().setbName("cloneBB");
        System.out.println(clone1.toString());
        System.out.println(cc.toString());
    }

    /**
     * 浅拷贝
     * @throws CloneNotSupportedException
     */
    private static void qiankaobei() throws CloneNotSupportedException {
        //浅拷贝
        final BB bb = new BB("bb",11);
        final AA wangwu = new AA(1, "wangwu",bb);
        final AA clone = (AA) wangwu.clone();
        clone.getBb().setbName("CloneBB");
        clone.setName("cloneAA");
        clone.setId(2);
        //输出源对象
        System.out.println(wangwu.toString());
        //输出克隆对象
        System.out.println(clone.toString());
    }


    static class BB implements Cloneable{
        private String bName;
        private Integer bId;

        public String getbName() {
            return bName;
        }

        public void setbName(String bName) {
            this.bName = bName;
        }

        public BB(String bName, Integer bId) {
            this.bName = bName;
            this.bId = bId;
        }

        public Integer getbId() {
            return bId;
        }

        public void setbId(Integer bId) {
            this.bId = bId;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "BB{" +
                    "bName='" + bName + '\'' +
                    ", bId=" + bId +
                    '}';
        }
    }



    static class AA implements Cloneable{
        private Integer id;
        private String name;
        private BB bb;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public AA(Integer id, String name, BB bb) {
            this.id = id;
            this.name = name;
            this.bb = bb;
        }

        public AA(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public BB getBb() {
            return bb;
        }

        public void setBb(BB bb) {
            this.bb = bb;
        }

        @Override
        public String toString() {
            return "AA{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", bb=" + bb +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }


    static class CC implements Cloneable{

        private String cName;
        private Integer cId;

        private BB bb;

        public CC(String cName, Integer cId, BB bb) {
            this.cName = cName;
            this.cId = cId;
            this.bb = bb;
        }

        public CC(CC cc) {
            this.cName = cc.cName;
            this.cId = cc.cId;
            try {
                this.bb = (BB)cc.bb.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }


        public Integer getcId() {
            return cId;
        }

        public void setcId(Integer cId) {
            this.cId = cId;
        }

        public BB getBb() {
            return bb;
        }

        public void setBb(BB bb) {
            this.bb = bb;
        }

        public String getcName() {
            return cName;
        }

        public void setcName(String cName) {
            this.cName = cName;
        }





        @Override
        protected Object clone() throws CloneNotSupportedException {
            final CC clone = (CC) super.clone();
            final BB clone1 = (BB) clone.bb.clone();
            clone.setBb(clone1);
            return clone;
        }

        @Override
        public String toString() {
            return "CC{" +
                    "cName='" + cName + '\'' +
                    ", cId=" + cId +
                    ", bb=" + bb +
                    '}';
        }
    }




}
