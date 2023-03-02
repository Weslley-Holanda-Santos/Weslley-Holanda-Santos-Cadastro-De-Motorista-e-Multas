package Entity;

public class PenaltyAuto {



    DriverCar driverCar;
    Car car;

    public Double priceInfraction;

    public String infraction;

    public DriverCar getDriverCar() {
        return driverCar;
    }

    public void setDriverCar(DriverCar driverCar) {
        this.driverCar = driverCar;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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




    public PenaltyAuto(DriverCar driverCar, Car car, String infraction, Double priceInfraction) {
        this.driverCar = driverCar;
        this.car = car;
        this.priceInfraction = priceInfraction;
        this.infraction = infraction;
    }

}
