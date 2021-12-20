import java.util.*;

public class hotchocolate {

    public static void main(String[] args) {
        
        System.out.println("What do you want?  Hot Chocolate or Coffee?");
        Scanner beverage = new Scanner(System.in);
        String drink = beverage.nextLine();
        //System.out.println(drink);


        if (drink.equalsIgnoreCase("Coffee")){
            System.out.println("Pick something better!");
        }
        else iCofff (drink.equalsIgnoreCase("Hot Chocolate")){
            System.out.println("Add something to it? Cream, Spice, Sweet, Plain");
            Scanner add = new Scanner(System.in);
            String additem = add.next();
            System.out.println(Extra(additem));

        }
        else{
            System.out.println("Your Not Thirsty");
        }

    }

    public static String Extra(String add){
        if(add.equalsIgnoreCase("Cream")){
            System.out.println("Add Ice Cream, Marshmallows, Peanut Butter");
            Scanner addto = new Scanner(System.in);
            String additem = addto.nextLine();
            return "You ordered Hot Chocolate with " + additem;
        }
        if(add.equalsIgnoreCase("Spice")){
            System.out.println("Add Cinnamon, Espresso, Peppermint");
            Scanner addto = new Scanner(System.in);
            String additem = addto.nextLine();
            return "You ordered Hot Chocolate with " + additem;
        }
        if(add.equalsIgnoreCase("Sweet")){
            System.out.println("Add Caramel, Chocolate, Orange");
            Scanner addto = new Scanner(System.in);
            String additem = addto.nextLine();
            return "You ordered Hot Chocolate with " + additem;
        }
        else {
            return "You ordered Plain Hot Chocolate";
        }

    }
}
