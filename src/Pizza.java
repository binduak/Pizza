/**
 * Created by bharat6666 on 4/16/16.
 */
import java.util.Scanner;
public class Pizza {
    enum typeOfCrust {Thick,Thin};


   public void print(){
        System.out.println("Enter type of crust");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        if(s.equals(typeOfCrust.Thick.name())){
            System.out.println("price for Thick crust pizza is Rs.300");
        }
        else if(s.equals(typeOfCrust.Thin.name()))
            System.out.println("Price for Thin Crust is Rs.250");
       else
            System.out.println("Wrong input");

    }


}
