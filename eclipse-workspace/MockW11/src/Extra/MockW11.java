package Extra;

public class MockW11 {
	
	 int l=10;
	 int b=11;
	 int h=10;
	
	public void showvalues() {
		System.out.println("length of cuboid:-"+ l);
		System.out.println("breadth of cuboid:-"+ b);
		System.out.println("height of cuboid:-"+ h);
		System.out.println("Volume of cuboid:- "+ l*b*h);
		
	} 
	
	public int VolumeDt () {
		return(l*b*h); 
	}
	
	public void VolumePar(int x, int y, int z) {
	
		System.out.println("Volume of cuboid with return parameters :- "+(x*y*z));
	} 
	
	public int VolumePar1 (int p, int q, int r) {
		return(p*q*r);
		
	} 	
	
	
	public static void main(String[] args) {
		MockW11 a=new MockW11();
		a.showvalues();
		
		MockW11 b=new MockW11();
		b.VolumeDt();
		System.out.println("Volume of cuboid with return datatypes:- "+ b.VolumeDt());
		
		MockW11 c=new MockW11();
		c.VolumePar(10,10,10);
		
		MockW11 d=new MockW11();
		d.VolumePar1(10,5,10);
		System.out.println("Volume of cuboid with return data types & parameters :- "+d.VolumePar1(10,5,10));
		
	}
	
		
	

}
