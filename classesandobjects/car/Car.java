package classesandobjects.car;

public class Car {
    private String model;
    private int mileage;
    private int manufactureYear;

    public Car(String model, int mileage, int manufactureYear) {
        this.model = model;
        this.mileage = mileage;
        this.manufactureYear = manufactureYear;
    }
    public String getModel() {
        return model;
    }
    public int getMileage() {
        return mileage;
    }
    public int getManufactureYear() {
        return manufactureYear;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }
    public String toString() {
        return "Car{" +
                 "model='" + model + '\'' +
                ", mileage='" + mileage + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                '}';
    }

}
