package task.sixth;

public class Human implements Cloneable {
    String name;
    Car car;

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public Human(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human human = (Human) super.clone();
        human.car = (Car) this.car.clone();
        return human;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
