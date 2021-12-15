
public class gameProject {

    import java.util.*;

    public static void main (String[] args) {

        Scanner poop = new Scanner (System.in);
        Intro();

        //selecting level of difficulty

        String level = "Not Selected";

        while(!level.equals("Easy") && !level.equals("Medium") && !level.equals("Hard")){
        System.out.println("First select your dificulty - enter 1 for easy, 2 for medium and 3 for easy.");
        int duck = poop.nextInt();
        
        if (duck==1){
            level = "Easy";
        }
        else if (duck==2){
            level = "Medium";
        }
        else if (duck==3){
            level = "Hard";
        }
        else {
            System.out.println("That is not a valid entry. Try Again.");
        }
    }
    }

    // intro message - called before each game
    public static void Intro(){
        System.out.println("Welcome to Mr.Cummings' Guessing Game.");
        System.out.println("");
        System.out.println("?/?/?/?/?/?/?/?/?/?/?/");
        System.out.println("");
    }

}