package Overriding;

public class SBIBank extends RBIBank {
	public double rateofIntrest() {
		System.out.println(super.a);
		return 6.25;
	}
}
