import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int row=sc.nextInt();
		System.out.println("enter no of col");
		int col=sc.nextInt();
		int num=1;
		char ch='A';
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(num+""+ch+" ");
				num++;
				ch++;
			}
			System.out.println();
		}
	}
}
