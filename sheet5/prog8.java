import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x");
		int x=sc.nextInt();
		System.out.println("enter value of y");
		int y=sc.nextInt();
		int z=0;
		System.out.println("enter your operation");
		String operation=sc.next();
		switch(operation){

			case "multiply":z=x*y;
					System.out.println(" z " +z);
					
					if(z%2==0){
						System.out.println(z+ "is even number");
					}else{
						System.out.println(z+ "is odd number");
					}
		}
	}
}

