public class Transport {
    String brand;
    String model;
    private final int yearOfTheCar;
    private final String countryOfProduction;
    String bodyColor;
    int maxSpeed;

    public Transport(String brand, String model,
                     private final int yearOfTheCar,
                     private final String countryOfProduction,
                     int yearOfTheCar1, String countryOfProduction1, String bodyColor,
                     int maxSpeed) {
        if (brand == "" || brand == null) {
            brand = "default";
        }
        this.brand = brand;
        if (model == "" || model == null) {
            model = "default";
        }
        this.model = model;
        if (bodyColor == "") {
            bodyColor = "белый";
        }
        this.bodyColor = bodyColor;
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;

    }
    
}
