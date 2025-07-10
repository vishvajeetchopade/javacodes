/*import java.io.*;
class core2web{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a number");
		int x=Integer.parseInt(br.readLine());
		if(x>10){
			System.out.println(x+"is greater than 10");
		}
		else{
			System.out.println(x+"is less than 10");
		}
	}
}*/

import java.util.*;
class core2web{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
			int x=sc.nextInt();
		if(x>10){
			System.out.println(x+"is greater than 10");
		}
		else{
			System.out.println(x+"is less than 10");
		}
	}
}



