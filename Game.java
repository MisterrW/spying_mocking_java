public class Game {
  Rollable dice;
  Private int turnCount;

  public Game(Rollable dice) {
    this.dice = dice;
    this.turnCount = 0;
  }

  public boolean nextTurn(){
    int result = dice.roll();
    this.turnCount ++;
    return result > 2;
  }

  public int getTurnCount() {
    return this.turnCount;
  }
}