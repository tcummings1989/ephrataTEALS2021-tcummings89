
import java.util.*;

public class hockey {

    public static void main(String[] args) {
        
        int periodsPlayed = 3;
        String team = "Oiler";
        System.out.println(TotalGoals(team, periodsPlayed));


    }

        public static String TotalGoals(String teamName, int periods) {
            
            int sum = 0;
            double average = 0.0;

            for(int i=1; i<= periods ; i++){
                    Scanner poop = new Scanner (System.in);
                    System.out.println ("The " + teamName + " scored how many goals in " + i + "period");
                    int value = poop.nextInt();
                    sum = sum + value;
                    average = sum/(double)periods;
            }

            return "In " + periods + " periods of play they have " + sum + " goals and an average of " + average + " goals per period.";
        
    } 
}

