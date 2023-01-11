import java.util.Objects;

public class Bus extends Transport {


    public Bus(String brand, String model, String country, Integer year, String color, Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);


    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

}
