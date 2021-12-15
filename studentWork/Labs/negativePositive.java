public class negativePositive {

public static void main(String[] args){

    int x;
    x=0;

    if(x%2==0){
        System.out.println(x + " is an even number.");
    }
        else{
            System.out.println(x + " is an odd number.");
        }

        if(x>0){
            System.out.println(x + " is a positive number");
        }
        else if(x<0){
            System.out.println(x + " is a negative number");
        }
        else{
            System.out.println (x + " is neither positive or negative");
        }
}
}