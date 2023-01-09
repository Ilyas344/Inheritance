import java.util.Objects;

public class Bus extends Transport {
    private final String typeTransport="Автобус";
private Integer permanentSeat;
private Integer sittingPlace;


    public Bus(String brand, String model, String country, Integer year, String color, Integer maxSpeed,Integer sittingPlace,Integer permanentSeat) {
        super(brand,model,year,country,color,maxSpeed);
this.permanentSeat=Math.abs(permanentSeat);
this.sittingPlace=Math.abs(sittingPlace);

    }

    @Override
    public String toString() {
        return  typeTransport +super.toString()+
                ", кол-во стоячих мест: " + sittingPlace +
                ", кол-во сидячих мест: " + permanentSeat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return Objects.equals(typeTransport, bus.typeTransport) && Objects.equals(permanentSeat, bus.permanentSeat) && Objects.equals(sittingPlace, bus.sittingPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeTransport, permanentSeat, sittingPlace);
    }
}
