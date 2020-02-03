public class Die
{
  private int sides;
  public Die()
  {
      sides = 6;
  }
  public Die(int s)
  {
      sides = s;
  }
//   int numsides = 6; // number of sides on the die. Change this number for a different die.
//   int lastroll = 0;

  // methods
  public int roll()
  {
    int x = (int)((Math.random()*sides + 1));
    // lastroll = x;
    return x;
  }
}