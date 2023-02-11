public class Car extends Transport {
    private String registrationNumber;
    public Car(String brand, String model, private int yearOfTheCar, private String countryOfProduction, String bodyColor, int maxSpeed, private String registrationNumber) {
        super(brand, model, yearOfTheCar, countryOfProduction, yearOfTheCar1, countryOfProduction1, bodyColor, maxSpeed);
        if (registrationNumber == "") {
            registrationNumber = "Y268JD";
        }
        this.setRegistrationNumber(registrationNumber);
    }

    private String setRegistrationNumber(String registrationNumber) {
        return this.registrationNumber = registrationNumber;
    }

}
