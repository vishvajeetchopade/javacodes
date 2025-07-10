import java.io.*;
class c2w{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("enter no of rows");
		int n1=Integer.parseInt(br.readLine());
		System.out.println("enter no of columns");
		int n2=Integer.parseInt(br.readLine());
		for(int i=1;i<=n1;i++){
			for(int j=1;j<=n1;j++){
				System.out.print("$  ");
			}
			System.out.println();
		}
		
	}
}

