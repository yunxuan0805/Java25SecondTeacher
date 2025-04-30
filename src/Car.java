public class Car {
    public String name;
    public String color;

    public Car(String inputName, String inputColor) {
        this.name  = inputName;
        this.color = inputColor;
    }

    public void showCarInfo() {
        System.out.println("CarName: " + this.name + ",CarColor: " + this.color);
    }
}
