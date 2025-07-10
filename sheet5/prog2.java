import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your grade");
		char ch=sc.next().charAt(0);
		switch(ch){
			case'O':System.out.println("outstanding");
				break;
			case'A':System.out.println("Excellent");
			break;
			default:System.out.println("Good");
		}
	}
}	
