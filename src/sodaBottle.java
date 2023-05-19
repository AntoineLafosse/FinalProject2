public class sodaBottle extends bottle {
    String brand;
    public sodaBottle(String usaBrand){
        super("glass", 8);
        brand=usaBrand;
    }
    public String getBrand(){
        return brand;
    }

}
