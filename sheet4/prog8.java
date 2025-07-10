import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
			System.out.println("enter percentage");
			double x=sc.nextDouble();
			if(x>=85.00){
				System.out.println("passed with distinction");
			}
			else if(x>=75.00){
				System.out.println("passed with first class distinction");
			}
			else if(x>=60.00){
				System.out.println("passed with second class");
			}
			else{
				System.out.println("only passed");
			}
		}
	}




