package JavaBasics;

public class Practice26May {
public static void main(String[] args) {
	
	//Odd numbers between 1-10
	
//	
	for(int a=2;a<=10;a=a+2) {
		
		System.out.print(a+" ");
	}
	System.out.println();

		for(int i=1;i<=10;i=i+2) {
		System.out.print(i+" ");
	}
	System.out.println();
//
//	for(int c=1;c<=10;c=c+1) {
//		System.out.print(c+" ");
//	}
//	System.out.println();
//
//	
//for(int b=0;b<=8;b++) {
//	for(int d=0;d<=b;d++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}	

for (int x=1; x<=5;x++) {
	for(int y=4;y>=x; y--) {
		System.out.print(" ");
	}
	
	for(int z=1; z<=x;z++) {
		System.out.print("*");
	}
	System.out.println();

}	

	
}	
	
	

	
}


