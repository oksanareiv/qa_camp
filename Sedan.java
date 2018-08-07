public class Sedan extends Cars {
    private float price;
    protected Sedan(float price){
        this.price=price;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "price=" + price +
                '}';
    }

    public float getPrice() {
        return price;
    }
    public String getProductType(){
        return "Sedan";
    }
}
