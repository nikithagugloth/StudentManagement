public class Student {
    int id;
    String name;
    int age;

    // Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display student info
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
