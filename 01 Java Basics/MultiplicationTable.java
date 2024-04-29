public class MultiplicationTable {
	void table(int n) {
 for(int i = 1; i <= 10; i++) {
	 System.out.printf("%d * %d = %d", n, i, n*i).println();
 }
}
	
	void print( int n, int from, int to ) {
		 for(int i = from; i <= to; i++) {
			 System.out.printf("%d * %d = %d", n, i, n*i).println();
		 }
		}

		public static void main(String[] args) {
			MultiplicationTable number = new MultiplicationTable();
			number.table(30);
			number.print(16, 11, 20);
			
		}
	
}