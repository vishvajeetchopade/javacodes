import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			System.out.println("enter value of x");
			int x=sc.nextInt();
			System.out.println("enter value of y");
			int y=sc.nextInt();
			System.out.println("enter value of z");
			int z= sc.nextInt();
			if(z*z==x*x+y*y){
				System.out.println("its pythogrian triplet");
			}
			else{
				System.out.println("its not pythagorian triplet");
			}
		}
	}

