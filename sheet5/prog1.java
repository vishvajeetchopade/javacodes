import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice color");
		String color=sc.next();
		switch(color){
			case "red":
			case "green":
			case "yellow":	
				System.out.println("it is traffic color");
				 break;
			
			  
	
		
			default:
			System.out.println("it is not traffic color");
		}
	}
}	




