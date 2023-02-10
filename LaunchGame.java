import java.util.* ;
class Guesser
{
    int guessNum;

    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;
    }
}



class Player
{
    int guessNum;

    int guessingNumber(int n1,int n2)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player! Kindly guess the number between : " +n1+" to "+n2 );
        guessNum=scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    
    void collectNumFromGuesser()
    {
        Guesser g= new Guesser();
        numFromGuesser=g.guessingNumber();
    }

    int  Hint()
    {
        int n=numFromGuesser;
        
        n=n/10;
        n*=10;
        return n;

    }
    
    void collectNumFromPlayers()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber(Hint(),Hint()+10);
        numFromPlayer2=p2.guessingNumber(Hint(),Hint()+10);
        numFromPlayer3=p3.guessingNumber(Hint(),Hint()+10);

    }

     void compare()
    {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
               System.out.println("You all won the game");
            else if(numFromGuesser==numFromPlayer2)
               System.out.println("Player 1 and Player 2 won the game");
            else if(numFromGuesser==numFromPlayer3)
               System.out.println("Player 1 and Player 3 won the game");
            else 
               System.out.println("Player 1 won the game");
        }
        else if(numFromGuesser==numFromPlayer2)
        {
            if(numFromGuesser==numFromPlayer3)
               System.out.println("Player2 and Player 3 won the game");
            else 
               System.out.println("Player 2 won the game");
        }
        else if(numFromGuesser==numFromPlayer3)
        {
            System.out.println("Player3 won the game");
        }
        else 
        {
            System.out.println("Noone  won the game");
        }
    }
}



class LaunchGame 
{
    public static void main(String[] args) {
        System.out.println("Game Started");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}