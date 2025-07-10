import java.util.*;
class core2web{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int x= sc.nextInt();
		if(x% 13==0){
			System.out.println(x+"is in table of 13");
		}
		else{
			System.out.println(x+"is not in table of 13");
		}
	}
}
