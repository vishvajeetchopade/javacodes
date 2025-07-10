import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
	
		for(int i=0;i<=10;i++){
			if(i%2!=0){
				System.out.println("the odd number is:"+i);
				count++;
				
			}
		}
		System.out.println("the total count of odd numbers:" +count);
	}
}

