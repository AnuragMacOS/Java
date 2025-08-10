package sample;

public class operator 
{
  public static void main(String[] args)
  {
    //operator
    int a = 1;
    int b = 2;
    int div =a/b;
    int modulo =a%b;
    System.out.println(div);
    System.out.println(modulo);
// if double a or bor double div is used then we'll get answer in points=0.5 
    
    int numb =1;
    numb=numb+1;//--> or numb++
    System.out.println(numb);//-->2
    System.out.println(numb++);//-->2 cha next ma 2+1 hune ho
    System.out.println(numb);//-->aaba 3 vayo
    System.out.println(++numb);//-->already 4 vayo,it was 3 previously
    System.out.println(numb);
}
}
