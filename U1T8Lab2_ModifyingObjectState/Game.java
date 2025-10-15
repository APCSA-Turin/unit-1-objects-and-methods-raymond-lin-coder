package U1T8Lab2_ModifyingObjectState;

public class Game {
    private String gameName;
    private int players;
    private int score;
    public Game(String name, int numPlayers) {
        gameName = name;
        players = numPlayers;
        score = 0;
    }
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return players;
    }

   public int getScore() {
       return score;
   }
   public void addPlayer() {
       players++;
   }
   public void increaseScore(int increase) {
       score += increase;
   }
   public double averageScorePerPlayer() {
        if (players != 0) {
           return (double) score / players;
       }
        else {
           return 0.0;
       }
   }
   public boolean isGameOver() {
        if (score > 9) {
            return true;
        }
        else {
            return false;
        }
   }
}