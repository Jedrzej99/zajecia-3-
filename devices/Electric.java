package devices;

public class Electric extends Car{
    public Electric(String model, String producer, Double year, Double value) {
        super(model, producer, year, value);
    }
    boolean refuel = true;
    double fuel;

    void Elecrtic(Electric) {
        if (this.refuel){
            this.fuel = this.fuel +1.0;
            System.out.println("Tesla została zatankowana");
        }

    }
}
