package poly.Car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량선택 (k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량변경(k3 -> model3)
        Model3Car model3car = new Model3Car();
        driver.setCar(model3car);
        driver.drive();

        // 차량변경(model3 -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();


    }
}
