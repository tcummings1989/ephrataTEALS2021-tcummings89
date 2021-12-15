
import java.util.Scanner;

public class RentingCars {
    
    public static void main (String[] args){
        System.out.println("How many years have you been on this planet?");

        Scanner console = new Scanner (System.in);

        int age = console.nextInt();

        if (age < 16){
            System.out.println ("Can’t drive and can’t rent a car");
        }
        else if (age>=16 && age<25){
            System.out.println ("Can drive but can't rent a car");
        }
        else if (age>=25 && age<70){
            System.out.println ("Can drive and can rent a car");
        }
        else {
            System.out.println ("You are too old to be driving");
        }
    }

}
