import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int usaWaterBottle=0;
        int usaSodaBottle=0;
        int usaShelves=0;
        String usaWaterBrand="undef";
        String usaSodaBrand="undef";
        boolean valid=false;
        Scanner in = new Scanner(System.in);
        System.out.println("how many soda bottles do you have?");
        while(!in.hasNextInt()&&in.nextInt()>0){
            usaSodaBottle=in.nextInt();
        }
        System.out.println("What brand are these soda bottles(conk or bebi)?");
        while(in.nextLine()!="conk"||in.nextLine()!="bebi"){
            usaSodaBrand=in.nextLine();
        }
        System.out.println("how many water bottles do you have?");
        while(in.hasNextInt()&&in.nextInt()>0){
            usaWaterBottle=in.nextInt();
        }

        System.out.println("what brand are these water bottles(minira or jeyser)?");
        while(in.nextLine()!="minira"||in.nextLine()!="jeyser"){
            usaWaterBrand=in.nextLine();
        }
        System.out.println("how many shelves do you have?");
        while(in.hasNextInt()&&in.nextInt()>0){
            usaShelves=in.nextInt();
        }
        int usaTotal=usaWaterBottle+usaSodaBottle;
        storage warehouse=new storage(usaTotal,usaSodaBottle,usaWaterBottle,usaShelves,usaSodaBrand,usaWaterBrand);
        warehouse.fillShelves();
        //create an array of shelf objects, and fill them with soda bottles and water bottles.
    }
}
