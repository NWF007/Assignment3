package za.ac.cput.adp3.Polymorphism;

public class Child extends Human implements Surname {

    String name;
    String lastName;

    public Child(String name) {
        this.name = name;
        this.lastName = lastName();
    }

    @Override
    public String talk() {
        return super.talk() + " User";
    }

    @Override
    public String lastName() {
        return "Fortuin";
    }
}
