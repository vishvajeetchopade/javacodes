import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice");
		int x=sc.nextInt();
		switch(x){
			case 799:System.out.println("platinum plan");
				 break;
			case 599:System.out.println("gold plan");
			break;
			case 399:System.out.println("silver plan");
			break;
			case 199:System.out.println("bronze plan");
			break;
			default:

			if(x<199){
		       System.out.println("platform is free");
			}
		}
	}
}	
