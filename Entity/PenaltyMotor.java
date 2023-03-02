package Entity;


public class PenaltyMotor {


    DriverMotor driverMotor;
    motorbike motorbike;
    Car car;
    Truck truck;
    public Double priceInfraction;

    public String infraction;
    public PenaltyMotor(DriverMotor motorista, motorbike motorbike, String infraction, Double priceInfraction) {
        this.driverMotor = motorista;
        this.motorbike = motorbike;
        this.priceInfraction = priceInfraction;
        this.infraction = infraction;
    }



    public DriverMotor getDriverMotor() {
        return driverMotor;
    }

    public void setDriverMotor(DriverMotor driverMotor) {
        this.driverMotor = driverMotor;
    }

    public motorbike getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(motorbike motorbike) {
        this.motorbike = motorbike;
    }

    public Double getpriceInfraction() {
        return priceInfraction;
    }

    public void setpriceInfraction(Double valorMulta) {
        this.priceInfraction = valorMulta;
    }

    public Car getCar() {
        return car;
    }

    public void setAutomovel(Car car) {
        this.car = car;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setCaminhao(Truck truck) {
        this.truck = truck;
    }

    public Double getPriceInfraction() {
        return priceInfraction;
    }

    public void setPriceInfraction(Double priceInfraction) {
        this.priceInfraction = priceInfraction;
    }
}
