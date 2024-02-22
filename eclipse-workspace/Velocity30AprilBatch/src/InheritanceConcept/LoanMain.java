package InheritanceConcept;

public class LoanMain {
	
	
public static void main(String[] args) {
	
	
	HomeLoan hl=new HomeLoan();
	hl.name(" Amruta Bajirao Patil");
	hl.mobile();
	hl.pancard();
	hl.adharcard();
	hl.birthday();
	hl.birthmonth();
	hl.birthyear();
	hl.coapplicant();
	
	hl.bunglow();
	hl.newflat();
	hl.oldflat();
	
		
	System.out.println("______________________________________________________");
	PersonalLoan pl=new PersonalLoan();
	pl.ploan();
	
	pl.name(" Pramod Dilip Gaikwad");
	pl.mobile();
	pl.pancard();
	pl.adharcard();
	pl.birthday();
	pl.birthmonth();
	pl.birthyear();
	pl.coapplicant();
	
	
		
	System.out.println("______________________________________________________");
	
	VehicalLoan vl=new VehicalLoan();
	vl.twowheeler();
	vl.threewheeler();
	vl.fourwheeler();
	
	vl.name(" Mugdha Pramod Gaikwad");
	vl.mobile();
	vl.pancard();
	vl.adharcard();
	vl.birthday();
	vl.birthmonth();
	vl.birthyear();
	vl.coapplicant();
	
	
}	
	
	
}
