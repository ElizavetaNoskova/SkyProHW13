public class Transport {
    String brand;
    String model;
    private final int yearOfTheCar;
    private final String countryOfProduction;
    String bodyColor;
    int maxSpeed;

    public Transport(String brand, String model,
                      final int yearOfTheCar,
                      final String countryOfProduction,
                     String bodyColor,
                     int maxSpeed) {
        if (brand.isEmpty() || brand == null) {
            brand = "default";
        }
        this.brand = brand;
        if (model.isEmpty() || model == null) {
            model = "default";
        }
        this.model = model;
        if (bodyColor.isEmpty() || bodyColor == null) {
            bodyColor = "белый";
        }
        this.yearOfTheCar = yearOfTheCar;
        this.countryOfProduction = countryOfProduction;
        this.bodyColor = bodyColor;
        if (maxSpeed <= 0) {
            maxSpeed = 100;
        }
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfTheCar() {
        return yearOfTheCar;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfTheCar=" + yearOfTheCar +
                ", countryOfProduction='" + countryOfProduction + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static void main(String[] args) {
        Transport audi = new Transport("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 300 );
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 400, "A609AA");
        Bus blue = new Bus("", "", 2020, "Russia", "голубой", 120);
        System.out.println(audi.toString());
        System.out.println(kia.toString());
        System.out.println(blue.toString());
    }
}
