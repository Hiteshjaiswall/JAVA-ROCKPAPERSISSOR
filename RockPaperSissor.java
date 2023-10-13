import java.util.Random;
import java.util.Scanner;

public class RockPaperSissor {
    public static void main(String[] args ){
        // now tell the user to put the move 
        Scanner scanner = new Scanner(System.in); 
        while (true) {
        // string of move for rock paper sissor 
        String[] rps ={"r" , "p" , "s"};
        // move for the computer but t should be random
        String computerMove=rps[new Random().nextInt(rps.length)];
        String playerMove;
        while(true){
        System.out.println("Please Enter Your Move (r, p or s)");
        playerMove= scanner.nextLine();
        // to insure that the player is putting the right output
        if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s")){
            break;
        }
        System.out.println(playerMove + " is not valid");
    }
    if(playerMove.equals(computerMove)){
        System.out.println("The game was a Tie :(");
    }else if(playerMove.equals("r")){
        if(computerMove.equals("p")){
            System.out.println("You Lose Hahahahahha");
        }else if(computerMove.equals("s")){
            System.out.println("You Win yahhhhhhhhh");
        }
    }else if(playerMove.equals("p")){
        if(computerMove.equals("s")){
            System.out.println("You Lose Hahahahahha");
        }else if(computerMove.equals("r")){
            System.out.println("You Win yahhhhhhhhh");
        }
    }else if(playerMove.equals("s")){
        if(computerMove.equals("r")){
            System.out.println("You Lose Hahahahahha");
        }else if(computerMove.equals("p")){
            System.out.println("You Win yahhhhhhhhh");
        }
    }
    System.out.println("Play again ? (y/n)");
    String playAgain=scanner.nextLine();
        if(!playAgain.equals("y")){
            break;
        }
}
}
}