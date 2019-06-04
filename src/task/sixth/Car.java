package task.sixth;

import java.awt.*;

public class Car implements Cloneable {
    private String model;
    private String color;
    private int yearIssua;

    public Car(String model, String color, int yearIssua) {
        this.model = model;
        this.color = color;
        this.yearIssua = yearIssua;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearIssua() {
        return yearIssua;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearIssua(int yearIssua) {
        this.yearIssua = yearIssua;
    }

    @Override
    public Car clone() {
        return new Car(model, color, yearIssua);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearIssua=" + yearIssua +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("BMW", "white", 2017);
        Car cloneCar = (Car) car.clone();
        System.out.println(cloneCar.toString());
        car.getModel().setColor("red");
        System.out.println(car.toString());
        System.out.println(cloneCar.toString());
    }
}
