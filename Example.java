package Student;

public class Example {

        public static void main(String[] args) {
            Student a = new Student("truong", 15, 2f);
            System.out.println(a.getAge());
            a.setAge(18);
            System.out.println(a.getAge());
            a.setAge(5);
            System.out.println(a.getAge());
        }
    }

