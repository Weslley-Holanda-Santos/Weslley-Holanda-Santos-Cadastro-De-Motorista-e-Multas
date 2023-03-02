package Entity;

public class PenaltyTruck {

    DriverTruck driverTruck;

    Truck truck;

    public Double priceInfraction;

    public String infraction;


    public DriverTruck getDriverTruck() {
        return driverTruck;
    }

    public void setDriverTruck(DriverTruck driverTruck) {
        this.driverTruck = driverTruck;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Double getPriceInfraction() {
        return priceInfraction;
    }

    public void setPriceInfraction(Double priceInfraction) {
        this.priceInfraction = priceInfraction;
    }

    public String getInfraction() {
        return infraction;
    }

    public void setInfraction(String infraction) {
        this.infraction = infraction;
    }



    public PenaltyTruck(DriverTruck driverTruck, Truck truck, String infraction, Double priceInfraction) {
        this.driverTruck = driverTruck;
        this.truck = truck;
        this.priceInfraction = priceInfraction;
        this.infraction = infraction;
    }



}





