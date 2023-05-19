public class bottle {
    public String brand;
    public String material;
    public int volume;
    public bottle(String usaMaterial, int usaVolume){
        material=usaMaterial;
        volume=usaVolume;

    }
    public String getMaterial(){
        return material;
    }
    public int getVolume(){
        return volume;
    }


}
