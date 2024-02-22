package Overriding;

public class BankOverriding {
public static void main(String[] args) {
	SBIBank s=new SBIBank();
	s.rateofIntrest();
	System.out.println(s.rateofIntrest());
	
	
	HDFCBank h=new HDFCBank();
	h.rateofIntrest();
	System.out.println(h.rateofIntrest());
	
	
	
	PNBBank p=new PNBBank();
	p.rateofIntrest();
	System.out.println(p.rateofIntrest());
	
}
}
