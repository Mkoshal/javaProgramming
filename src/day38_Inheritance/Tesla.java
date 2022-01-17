package day38_Inheritance;

public class Tesla extends Car{

    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super(brand, model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(brand+" "+model+" is autoPilot mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+brand+" "+model);
    }

}
