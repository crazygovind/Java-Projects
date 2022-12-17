// Guessing number game Govind

import java.util.*;

public class NumberGuessing{
    public static void NumberGuess(){
        Scanner sc=new Scanner(System.in);
        int number= 1 + (int)(100*Math.random());
        
        int k=5;

        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number"
            + " within 5 trials.");

        for(int i=0;i<k;i++){
            System.out.println(
                "Guess the number:");

            int guess=sc.nextInt();
            if (number==guess){
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number>guess){
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if(number<guess){
                System.out.println(
                    "The number is "
                    + "smaller than " + guess);
            }
        }
        System.out.println(
                    "You have exhausted"
                    + " K trials.");
     
        System.out.println(
                    "The number was " + number);
    }

    public static void main(String args[]){
        NumberGuess();
    }
}