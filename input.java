package sample;
import java.util.Scanner;

public class input 
{
  public static void main(String[] args)
  {
    //how to take input?
    Scanner sc= new Scanner(System.in);//-->for input
    System.out.println("Input your age: ");
    int age = sc.nextInt();//-->to store that variable in int
    System.out.println("the age is" + age);

    System.out.println("Input your Name : ");
    String Name = sc.next();//-->nextLine to print whole name Anurag Bhatt, next()-->to print only first name Anurag
    System.out.println("the Name is " + Name);

  }
}
