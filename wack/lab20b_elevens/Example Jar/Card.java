


























public class Card
{
  private String suit;
  private String rank;
  private int pointValue;
  
  public Card(String paramString1, String paramString2, int paramInt)
  {
    rank = paramString1;
    suit = paramString2;
    pointValue = paramInt;
  }
  




  public String suit()
  {
    return suit;
  }
  



  public String rank()
  {
    return rank;
  }
  



  public int pointValue()
  {
    return pointValue;
  }
  





  public boolean matches(Card paramCard)
  {
    return (paramCard.suit().equals(suit())) && (paramCard.rank().equals(rank())) && (paramCard.pointValue() == pointValue());
  }
  












  public String toString()
  {
    return rank + " of " + suit + " (point value = " + pointValue + ")";
  }
}
