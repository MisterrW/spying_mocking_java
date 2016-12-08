import static org.junit.Assert.*;
import org.junit.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class GameTest {

  Game game;
  Rollable spyDice;
  
  @Before 
  public void before(){
    Rollable dice = new Dice(6);
    spyDice = Mockito.spy(dice);
    game = new Game(spyDice);
  }

  @Test
  public void testTakeTurn(){
    Mockito.when(spyDice.roll()).thenReturn(5);
    boolean result = game.nextTurn();
    assertEquals(true, result);
  }

  @Test
  public void testTakeTurnFailureStub(){
     Mockito.when(spyDice.roll()).thenReturn(2);
     boolean result = game.nextTurn();
     assertEquals(false, result);
  }
  
  @Test
  public void takeTurnMock() {
    Rollable diceMock = mock(Rollable.class);
    
  }
}






