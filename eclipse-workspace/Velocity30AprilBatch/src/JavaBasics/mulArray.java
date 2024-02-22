package JavaBasics;

public class mulArray {

		public static void main(String[]args) {
			
			//Multi-Array Declaration
			
			int a[][]=new int[3][2];
			
			//Writing Array
			a[0][0]=100;
			a[0][1]=200;

			a[1][0]=500;
			a[1][1]=600;

			a[2][0]=900;
			a[2][1]=1000;

		
			//Size of multi-array
			
			System.out.println("Row size :-" + a.length);
			System.out.println("Column size :-" + a[1].length);
			
			//Reading array
			for(int i=0;i<a.length;i++) { 
				
				for (int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+ " ");
				}
				System.out.println();
			}
				
		}

	}


