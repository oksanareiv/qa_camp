public class Mini extends Cars {
    private float price;
    protected Mini(float price){
        this.price=price;
    }
    public float getPrice() {
        return price;
    }
    public String getProductType(){
        return "Mini";
    }
}
