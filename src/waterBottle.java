public class waterBottle extends bottle{
    String brand;
    public waterBottle(String brand){
        super("plastic", 16);
        this.brand=brand;

    }
    public String getBrand(){
        return brand;
    }

}
