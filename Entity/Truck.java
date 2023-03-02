package Entity;

public class Truck extends vehicle {

    private String category;
   
    public Truck(String brand, String model, String color,
                 String board, String category) {
        super(brand, model, color, board);
        this.category = category;

    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
