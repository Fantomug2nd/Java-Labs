package lab_1;

public class Matrix {
	private long [][]A;
	private int N;
	private int m;
	
	public void setN(int N) {
		this.N = N;
		A = new long[N][];
		for(int i = 0; i< A.length; i++) {
			A[i] = new long[N];
		}
		randomA();
	}
	
	public void setM(int m) {
		this.m = m-1;
	}
	
	public void randomA() {
		for(int i = 0 ; i < N; i++)
			for(int j = 0; j< N; j++)
				A[i][j] = (long)(Math.random()*100);
	}
	
	public void sort() 
    { 
        for (int i=1; i<N; ++i) 
        { 
            long key = A[m][i];
            
            int j = i-1; 
  
            /* Move elements of A[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && A[m][j] > key) 
            { 
                swap(j+1,j); 
                j = j-1; 
            } 
            A[m][j+1] = key; 
        } 
    } 
	
	private void swap(int col1, int col2) {
		for(int i = 0; i < N ; i++) {
			long temp = A[i][col1];
			A[i][col1] = A[i][col2];
			A[i][col2] = temp;
		}
	}

	
	public long[][] getA() {
		return A;
	}
	
}
