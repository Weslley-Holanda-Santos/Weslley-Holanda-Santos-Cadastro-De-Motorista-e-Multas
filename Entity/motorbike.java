package Entity;


public class motorbike extends vehicle {

    private String capacity;


    public motorbike(String brand, String model, String color,
                     String board, String capacity) {
        super(brand, model, color, board);
        this.capacity = capacity;
    }


    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

}
