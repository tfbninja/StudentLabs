import java.util.List;
























public abstract class Board
{
  private Card[] cards;
  private Deck deck;
  private static final boolean I_AM_DEBUGGING = false;
  
  public Board(int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    cards = new Card[paramInt];
    deck = new Deck(paramArrayOfString1, paramArrayOfString2, paramArrayOfInt);
    



    dealMyCards();
  }
  




  public void newGame()
  {
    deck.shuffle();
    dealMyCards();
  }
  





  public int size()
  {
    return cards.length;
  }
  



  public boolean isEmpty()
  {
    for (int i = 0; i < cards.length; i++) {
      if (cards[i] != null) {
        return false;
      }
    }
    return true;
  }
  




  public void deal(int paramInt)
  {
    cards[paramInt] = deck.deal();
  }
  



  public int deckSize()
  {
    return deck.size();
  }
  




  public Card cardAt(int paramInt)
  {
    return cards[paramInt];
  }
  




  public void replaceSelectedCards(List<Integer> paramList)
  {
    for (Integer localInteger : paramList) {
      deal(localInteger.intValue());
    }
  }
  



  public String toString()
  {
    String str = "";
    if (cards.length > 0) {
      str = str + cards[0];
      for (int i = 1; i < cards.length; i++) {
        str = str + ", " + cards[i];
      }
    }
    return str;
  }
  





  public boolean gameIsWon()
  {
    if (deck.isEmpty()) {
      for (Card localCard : cards) {
        if (localCard != null) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  





  public abstract boolean isLegal(List<Integer> paramList);
  





  public abstract boolean anotherPlayIsPossible();
  





  private void dealMyCards()
  {
    for (int i = 0; i < cards.length; i++) {
      cards[i] = deck.deal();
    }
  }
}
