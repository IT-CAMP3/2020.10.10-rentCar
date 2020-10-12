public class Car extends Vehicle {
    private String color;

    public Car(String color,
               String brand,
               String model,
               double price,
               String plate) {
        super(brand, model, price, plate);
        this.color = color;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                ", color='" + color + '\'' +
                '}';
    }
}
