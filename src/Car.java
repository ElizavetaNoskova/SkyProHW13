public class Car extends Transport {
    private String registrationNumber;
    public Car(String brand, String model,  int yearOfTheCar, String countryOfProduction, String bodyColor, int maxSpeed, String registrationNumber) {
        super(brand, model, yearOfTheCar, countryOfProduction, bodyColor, maxSpeed);
        if (registrationNumber == "") {
            registrationNumber = "Y268JD";
        }
        this.setRegistrationNumber(registrationNumber);
    }

    private String setRegistrationNumber(String registrationNumber) {
        return this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
