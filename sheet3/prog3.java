import java.io.*;
class core2web{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("enter a number");
		int x=Integer.parseInt(br.readLine());
		if(x%2==0){
			System.out.println(x+"is even number");
		}
		else{
			System.out.println(x+"is odd number");
		}
	}
}
