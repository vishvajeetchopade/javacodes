class c2w{
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=(n-i);j>=1;j--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				if(j==4){
					System.out.print("a");
				}else if(j==3){
					System.out.print("a B");
				}else if(j==2){
					System.out.print("a B C");
				}else{
					System.out.print("A b C d");
				}
			System.out.println();
			}
		}
	}
}
	




