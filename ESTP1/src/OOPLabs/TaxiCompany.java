package OOPLabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaxiCompany {

    private ArrayList<Automobile> carList;

    public TaxiCompany(ArrayList<Automobile> carList){
        this.carList = carList;
    }

    public ArrayList<Automobile> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Automobile> carList) {
        this.carList = carList;
    }

    public void companyPrice(){
        System.out.println("Total price: " + carList.stream().mapToDouble(Automobile::getPrice).sum());
    }

    private HashMap<Automobile, Double> createFuelRateList(){
        HashMap<Automobile, Double> automobileFuelRate = new HashMap<>();
        for (Automobile car : carList) {
            automobileFuelRate.put(car, car.getFuelRate());
        }

        return automobileFuelRate;
    }

    public void fuelSort(){
        System.out.println("Fuel sort: ");
        createFuelRateList().entrySet().stream().sorted(Map.Entry.<Automobile, Double>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public void findCarBySpeed(double minSpeed, double maxSpeed){
        System.out.println("Car with speed limits : ");
        for (Automobile car : carList) {
            System.out.println(car.getMaxSpeed() >= minSpeed && car.getMaxSpeed() <= maxSpeed ? car.toString() + "->" + car.getMaxSpeed() : "");
        }
    }
}
