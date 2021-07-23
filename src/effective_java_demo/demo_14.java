package effective_java_demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class demo_14 {


    static class User{

        private int age;
        private String name;
        private String sex;

        public static final Comparator<User> COMPARATOR = Comparator.comparing(
                (User user )-> user.sex).thenComparingInt(user-> user.age).thenComparing(user -> user.name);
        
        public User(int age, String name, String sex) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
            this.age = age;
            this.name = name;
            this.sex = sex;
        }



        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        final ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"a","男"));
        users.add(new User(3,"b","男"));
        users.add(new User(5,"c","男"));
        users.add(new User(2,"e","男"));
        users.add(new User(9,"a","女"));
        users.add(new User(2,"g","女"));
        users.add(new User(1,"h","女"));


        final List<User> collect = users.stream().sorted(User.COMPARATOR).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }

}
