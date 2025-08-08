package sample;

public class ExceptionHandling 
{
  public static void main(String[] args)
  {
    //Try catch in exception handling

    //  int[] marks= {97,98,95};
    //  System.out.println(marks[5]);
    //  System.out.println("the student's name is Anurag");
  //-->exception aayo 5 but tala ko fn print vayena so for that we use try and catch
     

    //Try catch in exception handling
     int[] marks= {97,98,95};
     try      //ja ja exception aauna sakcha like marks[5] chaina ni hamro array ma
     {
      System.out.println(marks[5]);
     }catch(Exception exception)
     {
      //do something after catching

     }
     System.out.println("the student's name is Anurag");

  }
}
 