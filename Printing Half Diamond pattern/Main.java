import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
	    for(int i = 1; i <= n; i++)
	    {
            // Handle space for each row
	        for(int space = 1; space <=  n - i; space++)
	        {
	            System.out.print(" ");
	        }
            // Handle stars for each row
	        for(int j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
}