package InterfaceConcepts;

public class HybridInheritance extends LMN implements B1,B2 {

	
	public void m3() {
		
		System.out.println("method of B2 interface");
	}

	
	public void m2() {
		
		System.out.println("method of B1 interface");
	}

	
	public void m4() {
		
		System.out.println("Logic 1 time only- considered B1 as 1st priority");
	}
public static void main(String[] args) {
	HybridInheritance hi=new HybridInheritance();
	hi.m1();
	hi.m2();
	hi.m3();
	hi.m4();
}
}
