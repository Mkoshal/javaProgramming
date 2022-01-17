package day38_Inheritance;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry","LE",2020,25000,"Gray",123456);


        Tesla tesla = new Tesla("Tesla Inc","Model 3",2022,57000,"black",10000);

        BMW bmw = new BMW("Mini","X 7",2021,80000,"white",5000);



        toyota.start();
        tesla.start();
        bmw.start();

    }
}
