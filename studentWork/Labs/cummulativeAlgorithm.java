import java.util.*;


public class cummulativeAlgorithm {
    
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println ("How many numbers do you want to add?");
        int numbersToAdd = s.nextInt();
        
        int sum = 0;
        for (int i=0; i < numbersToAdd; i++){
            System.out.println("What is the number that you'd like to add?");
            int value = s.nextInt();
            if (value % 2 == 0){
                sum = sum + value;
        }}
        double average = sum/(double)numbersToAdd;
       //System.out.println("The sum is "+ sum);
       //System.out.println("The average is " + average);
    }
}
