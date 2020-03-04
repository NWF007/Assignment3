package za.ac.cput.adp3.Encapsulation;

public class Encap {

    private String name = "NameName";
    private int age = 15;

    public Encap() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is "+name + " and my age is "+ age;
    }
}
