import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    System.out.println(power(base,exponent));
  }
  public static int power(int n1,int p1){
    int pr=1;
    if(n1>=0&&p1==0)
     pr =1;
    else if(n1==0&&p1>=1)
       pr=0;
    else
     for(int i=1;i<=p1;i++)
        pr = pr * n1;
        return pr;
  }
}