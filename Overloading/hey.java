package Overloading;
public class hey {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Thrishakatukuri");
        s1.setAge(16);

        System.out.println(s1.getName()); // Thrishakatukuri
        System.out.println(s1.getAge()); // 16
    }

}

class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
// Encapsulation = Data hiding + Accessing through methods
