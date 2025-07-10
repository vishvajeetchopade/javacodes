import java.util.*;
class c2w{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
	
		for(int i=0;i<row;i++){
			for(int j=1;j<=row;j++){
				System.out.print(j +" ");
				
			}
			System.out.println();
		}
	}
}
