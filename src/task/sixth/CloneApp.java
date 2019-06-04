package task.sixth;

public class CloneApp {
    public static void main(String[] args) {
        Car carForHuman = new Car ("BMW", "black", 2019);
        Human humanOne = new Human("Vasia",carForHuman);
        try {
            Human humanTwo = (Human) humanOne.clone();
            carForHuman.setModel("Audi");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
