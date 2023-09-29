package classesandobjects.car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 300_000, 2020);
        System.out.println(car1.getModel() + " " + car1.getMileage() + " " + car1.getManufactureYear());
        car1.setModel("Toyota");
        car1.setMileage(250_000);
        car1.setManufactureYear(2022);
        System.out.println(car1);
    }
}
