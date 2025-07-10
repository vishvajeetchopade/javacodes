class c2w{
	public static void main(String[] args){
		int n=4;
		int start=4;
		for(int i=n;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print((start-j)+" ");
			}
			System.out.println();
		}
	}
}
