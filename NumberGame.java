import java.util.*;
public class NumberGame {
    static int rounds=1;
    static int score=0;

    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc = new Scanner(System.in);
        int rand = r.nextInt(100) + 1;
        int count = 0; 
        int guess=0;
        System.out.println("\nNumber Guessing Game");
        System.out.println("Guess a number between 1 to 100. You have 7 attempts");
        //User input
        while (count < 7) {     
            guess = sc.nextInt();
            count++;
            if (guess == rand) {
            System.out.println("Your guess is correct:"+rand);
            score++;
            break;
            } 
            else if (guess < rand) {
                System.out.println("Too low!! Try again");
            } 
            else {
                System.out.println("Too high! Try again");
            }    
        }
        if(count==7 && guess!=rand){
            System.out.println("Out of attempts! The number was "+rand);
        }
        System.out.println("Game Over.\nDo You want to play again?(yes/no)");
        if(sc.next().equalsIgnoreCase("yes")){
            rounds++;
            count=0;
            main(args); 
        }
        else{
            System.out.println("Thanks for playing!");
            System.out.println("Score: You won "+ score +" out of "+ rounds+ " rounds");
            System.exit(0);
        }
        sc.close();
    }
    
}



