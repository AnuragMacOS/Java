package sample;

public class BreakContinue 
{
  public static void main(String[] args)
  {
    // break continue
    int i=0;
    while(true)
    {
      if(i==3) //3 shouldn't be printed for that we'll use  continue
      {
        i=i+1;
        continue;
      }
      System.out.println(i);
      i=i+1;
      if(i>5) //3 bina all print
      {
        break;
      }
     

    }

  }
}
