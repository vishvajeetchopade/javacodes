import java.io.*;
class core2web{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter a number");
		int x=Integer.parseInt(br.readLine());
		if(x%7==0){
			System.out.println(x+"is divisible by7");
		}else{
			System.out.println(x+"is not divisible by7");
		}
	}
}



