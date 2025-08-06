package sample;

import java.util.Arrays;

public class array {
  public static void main(String[] args)
  {
    int age=30;
    int physics=91;
    int chem=89;
    int eng=87;

   int[] marks =new int[3];
   marks[0]=91;
   marks[1]=89;
   marks[2]=87;

   System.out.println(age);
   System.out.println(physics);
   System.out.println(chem);
   System.out.println(eng);
  //  System.out.println(marks[1]);

  //length
 System.out.println(marks.length);

 //87,89,91 

 //sort
 System.out.println(marks[0]);//-->91
 Arrays.sort(marks);
 System.out.println(marks[0]);//-->87 aaucha means sort vayo

  
}
}
