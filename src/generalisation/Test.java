package generalisation;

public class Test {

	public static void main(String[] args) {
	BOI b=new BOI();
	System.out.println("Interest rate of Bank of India Bank is "+RBI.a);
	b.account();
	b.moneytransfer();
	b.atm();
	b.fd();
System.out.println("----------------------------------------");
	Unionbank u=new Unionbank();
	System.out.println("Interest rate of Union Bank is "+RBI.a);
	u.account();
	u.moneytransfer();
	u.atm();
	u.loker();
System.out.println("----------------------------------------");
	
	Axisbank a=new Axisbank();
	System.out.println("Interest rate of Axis Bank is "+RBI.a);
	a.account();
	a.moneytransfer();
	a.atm();
	a.loan();
System.out.println("----------------------------------------");
			
	}

}
