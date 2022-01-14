package day05_Concetation;
/*1. CreateaclasscalledShippingAddress.java 2. Declarethefollowingvariables:
        1. name
        2. buildingNumber
        3. streetName 4. city
        5. state
        6. zipCode
        3. Useconcatenationtoprintthefulladdress*/
public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Ulan";
        char buildingNumber = 'B';
        String streetName = "11841 Academy Road";
        String city = "Philadelphia";
        String state = "PA";
        int zipCode = 19154;

        System.out.println( streetName + " " + buildingNumber + " "+ " " + city + " " + state + " " + zipCode );

    }
}
