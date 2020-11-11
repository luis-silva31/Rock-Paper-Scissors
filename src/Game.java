public class Game {

    Player player1 = new Player();
    Player player2 = new Player();

    public void Game(int numRounds){
        for (int i = 0; i < numRounds; i++){
            System.out.println("Player 1 hand: " + player1.hand());
            System.out.println("Player 2 hand: " + player2.hand());
            if(player1.hand() == HandType.ROCK && player2.hand() == HandType.SCISSORS){
                player1.victoryCount++;
            }
            if(player2.hand() == HandType.ROCK && player1.hand() == HandType.SCISSORS){
                player2.victoryCount++;
            }
            if(player1.hand() == HandType.PAPER && player2.hand() == HandType.ROCK){
                player1.victoryCount++;
            }
            if(player2.hand() == HandType.PAPER && player1.hand() == HandType.ROCK){
                player2.victoryCount++;
            }
            if(player1.hand() == HandType.SCISSORS && player2.hand() == HandType.PAPER){
                player1.victoryCount++;
            }
            if(player2.hand() == HandType.SCISSORS && player1.hand() == HandType.PAPER){
                player2.victoryCount++;
            }
        }

        compare();
    }

    public void compare(){
        if(player1.victoryCount > player2.victoryCount){
            System.out.println("Player 1 won.");
        }
        if(player2.victoryCount > player1.victoryCount){
            System.out.println("Player 2 won.");
        }
        if(player1.victoryCount == player2.victoryCount){
            System.out.println("It's tied. Next round victory wins.");
            Game(1);
        }
    }
}
