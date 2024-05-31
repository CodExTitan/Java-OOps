package OopsLearnung;

public class CarObjectExample {
    String name;
    String model;
    double price;
    int year;
    String color;
    String engine;

//below code is the example of creating a constructor
    public CarObjectExample(String name, String model, double price, int year, String color, String engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return name + ": This is a " + model + " is worth of $" + price + ", It is a new model of year " +
                year + ". The color is " + color + " and the engine is " + engine + ".";

    }
}
