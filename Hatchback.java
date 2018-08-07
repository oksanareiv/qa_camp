public class Hatchback extends Cars {
    private float price;
    protected Hatchback(float price){
        this.price=price;
    }

    @Override
    public String toString() {
        return "Hatchback{" +
                "price=" + price +
                '}';
    }

    public float getPrice() {
        return price;
    }
    public String getProductType(){
        return "Hatchback";
    }
}
