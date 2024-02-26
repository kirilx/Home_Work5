import java.time.Year;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;


    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }

    public double getTax() {
        int age = calculateAge();
        if (age >= 5) {
            return price * 0.05;
        } else {
            return 0;
        }
    }


    public void printInfo() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + getTax());
        System.out.println("Age: " + calculateAge());
    }
    public Car() {
        this.brand ="";
        this.model ="";
        this.year = 0;
        this.price = 0.0;


    }
}
