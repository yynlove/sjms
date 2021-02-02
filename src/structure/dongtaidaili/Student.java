package structure.dongtaidaili;

public class Student implements Person{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void setName() {
        System.out.println("设置》》"+name);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
