package entities;

public class Peoples {
    private String name;
    private int age;
    private double height;

    public Peoples(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    // GETTERS
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    // SETTERS
    public void setName(String name) {
       this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return name + age + height;
    }
}
