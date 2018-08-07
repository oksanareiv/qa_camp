public class Line {
    public static void main(String args[]){
        Cars[] newcar = new Cars[3];
        newcar[1] = CarsFactory.createCar("Mini");
        newcar[2] = CarsFactory.createCar("Hat");
        System.out.println(newcar[2].toString());
    }
}
