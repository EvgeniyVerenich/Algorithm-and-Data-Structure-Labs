package OOPLabs;

public class Automobile {

    private String name;
    private double maxSpeed, weight, fuelRate, price;


    public Automobile(){}

    public Automobile(String name, double maxSpeed, double weight, double fuelRate, double price){
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.fuelRate = fuelRate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public void setFuelRate(double fuelRate) {
        this.fuelRate = fuelRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "name='" + name + '\'' +
                '}';
    }

}
