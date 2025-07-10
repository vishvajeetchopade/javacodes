import java.util.*;
class core2web{
	public static void main(String[] args){
		Scanner sc=new Scanner(	System.in);
		System.out.println("enter a number");
		int x=sc.nextInt();
		if(x>1&&x<1000){
			System.out.println(x+"is in in range of 1 to 1000");
		}
		else{
			System.out.println(x+"is not in range of 1 to 1000");
		}
	}
}
