public class CarsFactory {
    public static Cars createCar(String what){
        if (what.equals("Sedan")) {
            return new Sedan(17122);
        } else if (what.equals("Mini")) {
            return new Mini(1999);
        } else {return new Hatchback(11999);}
}}
