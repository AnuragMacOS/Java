//taking input continuosly using do while

package sample;
import java.util.Scanner;

public class loopByinput 
{
  public static void main(String[] args)
  //loops
  {
    Scanner sc= new Scanner(System.in);
  int number=0;
  do{
    System.out.println("input a number: ");
    number=sc.nextInt();
    System.out.println("the number is: ");
    System.out.println(number);

  }while(number>=0);
  System.out.println("the end");
} 
}
