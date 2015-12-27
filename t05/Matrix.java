package javase01.t05;

class Matrix {
	public static void main(String[] args) {
		
		int size = 9;
		byte matrix[][] = new byte[size][size];
		
		int s, c;
		
		//matrix [s][c] s - строки с - колонки
		
		for(s = 0; s < size; ++s) {
			for(c = 0; c < size; ++c) {
				if ((c == s) || (c == (size - s - 1))) 
					matrix[s][c] = 1;
				else matrix[s][c] = 0;
			}
		}
        
        for(s = 0; s < size; ++s) {
     
			for(c = 0; c < size; ++c) {
                System.out.print(matrix[s][c] + " ");
            }
            System.out.println();
        }
	}	
}
