import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1){
					System.out.print(" d ");
				}else if(j==2){
					System.out.print(" c ");
				}else if(j==3){
					System.out.print(" b ");
				}else{
					System.out.print(" a ");
				}
			}
			System.out.println();
		}
	}
}
