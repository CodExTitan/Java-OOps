package OopsLearnung;

public class Get_SettersClass {
       private String name;
       private String model;
       private double price;
       private int year;
       private String color;
       private String engine;

        //below code is the example of creating a constructor
        public Get_SettersClass(String name, String model, double price, int year, String color, String engine) {
            this.name = name;
            this.model = model;
            this.price = price;
            this.year = year;
            this.color = color;
            this.engine = engine;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getModel(){
            return model;
        }
        public void setModel(String model){
            this.model = model;
        }

        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public int getYear(){
            return year;
        }
        public void setYear(int year){
            this.year = year;
        }
        public String getColor(){
            return color;
        }
        public void setColor(String color){
            this.color = color;
        }

        public String getEngine(){
            return engine;
        }
        public void setEngine(String engine){
            this.engine = engine;
        }

        public String toString() {
            return getName() + ": This is a " + getModel() + " is worth of $" + getPrice() + ", It is a new model of year " +
                    getYear() + ". The color is " + getColor() + " and the engine is " + getEngine() + ".";

        }
    }
// Public getters to get the value from private class and
// Public setters to update the value from private class.