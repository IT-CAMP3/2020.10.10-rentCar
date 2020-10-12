public class DataBase {
    private Vehicle[] vehicles = new Vehicle[5];
    private static final DataBase dataBase = new DataBase();

    public static DataBase getInstance() {
        return dataBase;
    }

    private DataBase() {
        Car c1 = new Car();
        c1.setBrand("BMW");
        c1.setModel("3");
        c1.setPlate("KR123");
        c1.setPrice(300.00);
        c1.setRent(false);
        c1.setColor("Red");

        this.vehicles[0] = c1;

        this.vehicles[1] = new Car("Black",
                "Audi",
                "A3",
                310.00,
                "KR999");

        this.vehicles[2] = new Car("Yellow",
                "Seat",
                "Ibiza",
                200.00,
                "WAW753");

        this.vehicles[3] = new Bus("MAN",
                "2000",
                600.00,
                "KR666",
                45,
                6);

        this.vehicles[4] = new Bus("Volvo",
                "KN1000",
                800.00,
                "DJE554",
                60,
                7);
    }

    public Car[] getCars() {
        int carCounter = 0;
        for(Vehicle currentVehicle : this.vehicles) {
            if(currentVehicle instanceof Car) {
                carCounter++;
            }
        }

        Car[] result = new Car[carCounter];
        int counter = 0;
        for(int i = 0; i < this.vehicles.length; i++) {
            if(this.vehicles[i] instanceof Car) {
                result[counter++] = (Car) this.vehicles[i];
            }
        }

        return result;
    }

    public Bus[] getBuses() {
        int busCounter = 0;
        for(Vehicle currentVehicle : this.vehicles) {
            if(currentVehicle instanceof Bus) {
                busCounter++;
            }
        }

        Bus[] result = new Bus[busCounter];
        int counter = 0;
        for(int i = 0; i < this.vehicles.length; i++) {
            if(this.vehicles[i] instanceof Bus) {
                result[counter++] = (Bus) this.vehicles[i];
            }
        }

        return result;
    }

    public Vehicle[] getVehicles() {
        return this.vehicles;
    }

    public boolean rentVehicle(String plate) {
        for(Vehicle currentVehicle : this.vehicles) {
            if(currentVehicle.getPlate().equals(plate) && !currentVehicle.isRent()) {
                currentVehicle.setRent(true);
                return true;
            }
        }

        return false;
    }
}
