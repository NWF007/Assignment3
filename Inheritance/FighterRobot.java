package za.ac.cput.adp3.Inheritance;

public class FighterRobot extends Robot {

    public FighterRobot() {
        super();
    }

    @Override
    public String robotType() {
        return "Fighter"+robotType();
    }
}
