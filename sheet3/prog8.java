import java.io.*;
class core2web{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("enter a number1");
		int x=Integer.parseInt(br.readLine());
		System.out.println("enter a number2");
		int y=Integer.parseInt(br.readLine());
		if(x>y){
			System.out.println(x+"is greater in" +x+"and" +y);
		}
		else{
			System.out.println(x+"is less in" +x+"and" +y);
		}
	}
}
		


