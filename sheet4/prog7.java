import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
			System.out.println("enter selling price");
			int x=sc.nextInt();
			System.out.println("enter cost price");
			int y=sc.nextInt();
			int p=x-y;
			if(x>y){
			
			System.out.println("profit/" +p);
		}else{
			System.out.println("loss" +p);
	}
}
	}

