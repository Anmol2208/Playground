import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {                                             
    //Try out your code here
    Scanner in =new Scanner(System.in);
    int n= in.nextInt();
    int num;
    for (num = 1; num <=n; num++){
      if(n % num ==0){
        System.out.println(num);
      }
    }
    
  }
}