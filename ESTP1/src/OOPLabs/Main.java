package OOPLabs;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Automobile> automobiles = new ArrayList<>();
        Automobile automobile = new Automobile("opel", 150, 1205, 7, 6800);
        Automobile automobile1 = new Automobile("mazda", 167,1354,6.5,7500);
        Automobile automobile2 = new Automobile("audi", 189, 1275,6,9000);

        automobiles.add(automobile);
        automobiles.add(automobile1);
        automobiles.add(automobile2);

        TaxiCompany taxiCompany = new TaxiCompany(automobiles);
        taxiCompany.companyPrice();
        taxiCompany.fuelSort();
        taxiCompany.findCarBySpeed(125, 200);

    }
}
