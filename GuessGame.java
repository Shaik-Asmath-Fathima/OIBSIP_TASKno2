
    import java.util.Scanner;
    import java.lang.Math;
    public class GuessGame {
      public static void main(String[] args) {
        int answer = (int)(Math.random() * 100) + 1;
        int k = 5;
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        System.out.println("Hey user, welcome to the number guessing game!");
        System.out.println("In this game, you have to guess a number between 1 and 100.");
        System.out.println("You have 5 tries to guess the number.");
    
        while (k > 0) {
          System.out.println("Enter your guess: ");
          int guess = sc.nextInt();
          
          if (guess == answer) {
            System.out.println("You guessed the number!\nYou win!");
            correct = true;
            break;
          } else if (guess > answer) {
            System.out.println("Your guess is too high.\nYou have " + (k - 1) + " tries left.");
          } else {
            System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
          }
          
          k--;
        }
    
        if (!correct) {
          System.out.println("You ran out of tries.\nYou lose!");
          System.out.println("The number was " + answer);
        }
        
        // Close the scanner to avoid resource leak
        sc.close();
      }
    }
    
