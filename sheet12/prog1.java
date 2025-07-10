class c2w{
	public static void main(String[] args){
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=(n-i);j>=1;j--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print("1");
			}
					for(int j=2;j<=i;j++){
			System.out.print("1");
		}
		System.out.println();
	}
}
}
