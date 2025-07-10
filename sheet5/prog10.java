import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x");
		int x=sc.nextInt();
		System.out.println("enter value of y");
		int y=sc.nextInt();
		System.out.println("enter your operation");
		String operation=sc.next();
		int z=0;
		switch(operation){
			         
			case"add": z=x+y;
				System.out.println("z = "+z);
				  break;
		                 
			case"sub": z=x-y;
				  System.out.println("z = "+z);
			break;
				 
			case"mult": z=x*y;
				  System.out.println("z = "+z);
				   break;
			          
			case"div": z=z/y;
				   System.out.println("z = "+z);
				   break;
			default:System.out.println("invalid operation");

		}
	}
}

