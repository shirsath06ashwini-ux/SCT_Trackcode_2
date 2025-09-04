import java.util.random;
import java.util.*;

public class guess number{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        random rand=new random();
        
        //generate a random number between 1 and 100
        int number to guess=rand.nextInt(100)+1;
        int guess=0;

        System.out.println("welcome to the number guessing game !");
        System.out.println("guess a number between 1 and 100:");
        
        //loop until thr user guesses the correctly
        while(guess!=number to guess){
            guess=sc.nextInt();
            if(guess<number to guess){
                System.out.println("Too low!try again");
           }else if(guess>number to guess){
                System.out.println("Too high!try again");
           }else{
                System.out.println("congratulaions!you guessed the number"+number to guess+corectly!);
                      }
                                 
        }
        sc.close();
    }
}
        }