package Entity;

public class vehicle {

    public vehicle(String brand, String model, String color, String board) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.board = board;
    }

    private String brand;
    private String model;
    private String color;
    private String board;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }


}
