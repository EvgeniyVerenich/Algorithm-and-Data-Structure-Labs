package OOPLabs;

import java.util.ArrayList;
import java.util.Arrays;
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
        System.out.println(carList.stream().mapToDouble(Automobile::getPrice).sum());
    }

    private HashMap<Automobile, Double> createFuelRateList(){
        HashMap<Automobile, Double> automobileFuelRate = new HashMap<>();
        for (Automobile car : carList) {
            automobileFuelRate.put(car, car.getFuelRate());
        }

        return automobileFuelRate;
    }

    public void fuelSort(){
        createFuelRateList().entrySet().stream().sorted(Map.Entry.<Automobile, Double>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    public void findCarBySpeed(double minSpeed, double maxSpeed){
        for (Automobile car : carList) {
            System.out.println(car.getMaxSpeed() >= minSpeed || car.getMaxSpeed() <= maxSpeed ? car.toString() + "->" + car.getMaxSpeed():"");
        }
    }
}
