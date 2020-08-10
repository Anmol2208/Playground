import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int i =0;
      int sum=0;
      for (i=1; i<= n; i++)
        sum = sum+i;
        System.out.println(sum);
	}
}