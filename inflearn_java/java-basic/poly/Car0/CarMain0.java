package poly.Car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3car k3car = new K3car();

        driver.setK3car(k3car);
        driver.drive();

        // 추가
        Model3car model3car = new Model3car();
        driver.setK3car(null); // 더이상 안타니까 null로 변경
        driver.setModel3car(model3car);
        driver.drive();
    }
}
