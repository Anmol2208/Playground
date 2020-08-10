import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    for (int i=2;i<=n;i++){
      if(prime(i)){
        System.out.println(i);
      }
    }
  }
  public static boolean prime(int p){
    boolean isprime=true;
    for(int num = 2; num <= p/2; num++)
	    {
	        if(p % num == 0)
	        {
	            isprime = false;
	            break;
	        }
	    }
	    return isprime;
	}
 }