import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Car extends Transport {
    private final String typeTransport="Автомобиль";

    private Double engineVolume;
    private String transmission;
    private final String bodyType;
    private  String number;
    private final Integer seats;
    private  boolean winterSummer;
    public class Key{
        private boolean launch;
        private boolean keylessAccess;

        public boolean isLaunch() {
            return launch;
        }

        public void setLaunch(boolean launch) {
            this.launch = launch;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public void setKeylessAccess(boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
        }

        public Key(boolean launch, boolean keylessAccess) {
            if (launch==true)
            {this.launch = launch;}
            if (keylessAccess==true){
                this.keylessAccess = keylessAccess;}
        }
    }

    public Car(String brand, String model, Double engineVolume, String country, Integer year, String color,
               String transmission, String bodyType, String number, Integer seats,Integer maxSpeed) {
        super(brand,model,year,country,color,maxSpeed);
        java.util.Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        if (month<4&&month>10)
        {this.winterSummer = true;}
        else {this.winterSummer = false;}

        if (seats == null) {
            this.seats = 1;
        } else {
            this.seats = seats;
        }
        if (number == null || number.equals("")) {
            this.number = "default";
        } else {
            this.number = number;
        }
        if (bodyType == null || bodyType.equals("")) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }


        this.engineVolume = engineVolume;



    }

    @Override
    public String toString() {
        String tire;
        if(winterSummer==true){tire="летняя";}else {tire="зимняя";}
        return typeTransport+super.toString()+
                "\nмощность двигателя: " + engineVolume +
                ", трансмиссия: " + transmission +
                ", тип кузова: " + bodyType +
                ", рег. номер: " + number +
                ", кол-во мест: " + seats +
                ", резина "+tire+
                ".\n";
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, transmission, bodyType, number, seats, winterSummer);
    }

    public Double getEngineVolume() {

        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }





    public void setTransmission(String transmission) {
        if (transmission == null || transmission.equals("")) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }

    }

    public void setNumber(String number) {
        if (number == null || number.equals("")) {
            this.number = "default";
        } else {
            this.number = number;
        }
    }

    public void setWinterSummer(boolean winterSummer) {
        java.util.Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        if (month<4&&month>10)
        {this.winterSummer = true;}
        else {this.winterSummer = false;}
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumber() {
        return number;
    }

    public Integer getSeats() {
        return seats;
    }

    public boolean isWinterSummer() {
        return winterSummer;
    }
}
