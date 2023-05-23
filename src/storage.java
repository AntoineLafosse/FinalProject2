import java.util.ArrayList;

public class storage {
    int totalBottles;
    int totalSodaBottles;
    int totalWaterBottles;
    String sodaBrand;
    String waterBrand;
    ArrayList<shelf> shelves= new ArrayList<shelf>();
    public storage(int usaTotal,int usaSoda,int usaWater,int numShelves,String sodaBrand,String waterBrand){
        this.sodaBrand=sodaBrand;
        this.waterBrand=waterBrand;
        totalBottles=usaTotal;
        totalSodaBottles=usaSoda;
        totalWaterBottles=usaWater;
        for(int i=0;i<numShelves;i++){
            shelves.add(new shelf());
        }
    }
    public int getSoda(){
        return totalSodaBottles;
    }
    public int getWater(){
        return totalWaterBottles;
    }
    public int getTotalBottles(){
        return totalBottles;
    }
    public void fillShelves(){
        for(shelf usaShelf:shelves){
            while(!usaShelf.getFull()){
                if(totalSodaBottles>0){
                    usaShelf.add(new sodaBottle(sodaBrand));
                    totalSodaBottles-=1;
                }
                else if(totalWaterBottles>0){
                    usaShelf.add(new waterBottle(waterBrand));
                    totalWaterBottles-=1;
                }
                else{
                    System.out.println("No Bottles left!");
                }
            }
        }

    }


}
