package Entity;

public class DriverMotor {

    private String name;
    private String cnh;

    private String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public DriverMotor(String name, String age, String cnh) {
        this.name = name;
        this.cnh = cnh;
        this.age = age;
    }
}
