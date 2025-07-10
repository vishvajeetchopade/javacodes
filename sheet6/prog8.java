import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int number =14;
		System.out.println("the reverse table of"+number+":");
		for (int i=10;i>=1;i--){
			System.out.println((number*i));
		}
	}
}
