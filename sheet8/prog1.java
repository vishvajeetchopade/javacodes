import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		int num=1;
		
		for(int i=0;i<row;i++){
			int temp=num;
			for(int j=0; j<row;j++){
				System.out.print(temp +" ");
				temp++;
				
			}
			num+=2;
			System.out.println();
		}
	}
}
