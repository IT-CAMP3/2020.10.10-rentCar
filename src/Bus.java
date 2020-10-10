public class Bus extends Vehicle {
    private int seats;
    private int wheels;

    public Bus(String brand,
               String model,
               double price,
               String plate,
               int seats,
               int wheels) {
        super(brand, model, price, plate);
        this.seats = seats;
        this.wheels = wheels;
    }

    Bus() {}

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
