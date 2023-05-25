import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;
import static java.lang.System.in;

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
        String usaInput=in.nextLine();
        Scanner s = new Scanner(usaInput).useDelimiter("[^0-9]");
        while(!in.hasNextInt()){
            System.out.println("Please enter a number");
            usaInput=in.nextLine();
        }
        usaInput=in.nextLine();
        if((parseInt(usaInput)<0)){
            valid=false;
            while(!valid){
                System.out.println("Please input a positive number");
                usaSodaBottle=in.nextInt();
                if(usaSodaBottle>0){
                    valid=true;
                }
            }
        }
        System.out.println("What brand are these soda bottles(conk or bebi)?");
        usaSodaBrand=in.nextLine();
        while(!usaSodaBrand.equals("conk")&&!usaSodaBrand.equals("bebi")){
            System.out.println("please enter a valid brand");
            usaSodaBrand=in.nextLine();
        }
        System.out.println("how many water bottles do you have?");
        usaInput=in.nextLine();
        s.useDelimiter("[^0-9]");
        while(!in.hasNextInt()){
            System.out.println("Please enter a number");
            usaInput=in.nextLine();
        }
        usaWaterBottle=in.nextInt();
        if(usaWaterBottle<0){
            valid=false;
            while(!valid){
                System.out.println("Please input a positive number");
                usaWaterBottle=in.nextInt();
                if(usaWaterBottle>0){
                    valid=true;
                }
            }
        }
        System.out.println("what brand are these water bottles(minira or jeyser)?");
        usaWaterBrand=in.nextLine();
        while(!usaWaterBrand.equals("jeyser")&&!usaWaterBrand.equals("minira")){
            System.out.println("please enter a valid brand");
            usaWaterBrand=in.nextLine();
        }

        System.out.println("how many shelves do you have?");
        usaInput=in.nextLine();
        s.useDelimiter("[^0-9]");
        while(!in.hasNextInt()){
            System.out.println("Please enter a number");
            usaInput=in.nextLine();
        }
        usaShelves=in.nextInt();

        int usaTotal=usaWaterBottle+usaSodaBottle;
        storage warehouse=new storage(usaTotal,usaSodaBottle,usaWaterBottle,usaShelves,usaSodaBrand,usaWaterBrand);
        warehouse.fillShelves();
        System.out.println(warehouse.getShelves());
        //create an array of shelf objects, and fill them with soda bottles and water bottles.
    }
}
