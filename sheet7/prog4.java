import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		System.out.println("enter no of cols");
		int col=sc.nextInt();
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				System.out.print(" 1 ");
			}
			System.out.println();
		}
	}
}
