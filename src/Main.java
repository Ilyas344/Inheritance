public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", (1.7), "Россия", 2015, "желтый",
                "ручная", "кроссовер", "А767ЕВ777", 4,90);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", (3.0), "Германия", 2020, "черный",
                "ручная", "кроссовер", "В346ЕВ777", 4,200);
        Car bmw = new Car("BMW", "Z8", (3.0), "Германия", 2015, "черный",
                "ручная", "кроссовер", "В375ЕВ777", 4,240);
        Car kia = new Car("Kia", "Sportage 4-го поколения", (2.4), "Ю.Корея", 2018, "красный",
                "ручная", "кроссовер", "Е373ЕЕ777", 4,190);
        Car hyundai = new Car("Hyundai", null, (1.6), "Ю.Корея", 2016, "оранжевый",
                "ручная", "кроссовер", "Н337ВВ777", 4,180);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);
        System.out.println(lada);
        System.out.println();
        Bus paz=new Bus("ПАЗ","3205","Россия",2020,"белый",60);
        Bus maz=new Bus("МАЗ","241","Россия",2021,"синий",60);
        Bus liaz=new Bus("ЛИАЗ","677","Россия",2022,"красный",60);
        System.out.println(paz);
        System.out.println(maz);
        System.out.println(liaz);
    }

}