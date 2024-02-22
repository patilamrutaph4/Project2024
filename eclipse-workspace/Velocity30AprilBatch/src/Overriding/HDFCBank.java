package Overriding;

public class HDFCBank extends RBIBank{
	public double rateofIntrest() {
		System.out.println(super.a);
		return 7.5;
	}
}
