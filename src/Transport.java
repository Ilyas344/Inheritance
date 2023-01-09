import java.util.Objects;

public class Transport {

    private final String brand;
    private final String model;
    private final Integer year;
    private final String country;
    private String color;
    private Integer maxSpeed;

    public Transport(String brand, String model, Integer year, String country, String color, Integer maxSpeed) {
        if (brand == null || brand.equals("")) {
            this.brand = "default brand";
        } else {
            this.brand = brand;
        }

        if (model == null || model.equals("")) {
            this.model = "default model";
        } else {
            this.model = model;
        }

        this.year = Math.abs(year);
        if (country == null || country.equals("")) {
            this.country = "default country";
        } else {
            this.country = country;
        }

        if (color == null || color.equals("")) {
            this.color = "default color";
        }
            this.color = color;

        if (maxSpeed == 0) {
            this.maxSpeed = 1;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        {
            if (color == null || color.equals("")) {
                this.color = "без цвета";
            } else {
                this.color = color;
            }
        }
    }

    public void setMaxSpeed(Integer maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 1;
        } else {
            this.maxSpeed = Math.abs(maxSpeed);
        }
    }



    @Override
    public String toString() {
        return ": " + brand + " " + model +
                ",год выпуска: " + year +
                ", страна производства: " + country +
                ", цвет: " + color +
                ", максимальная скорость: " + maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(year, transport.year) && Objects.equals(country, transport.country) && Objects.equals(color, transport.color) && Objects.equals(maxSpeed, transport.maxSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year, country, color, maxSpeed);
    }
}
