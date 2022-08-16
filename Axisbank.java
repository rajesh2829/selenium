package override;

public class Axisbank extends Bankinfo{
	public void deposit() {
	System.out.println("1500000");	

	}

	public static void main(String[] args) {
		Axisbank axis=new Axisbank();
		axis.saving();
		axis.fixed();
		axis.deposit();

	}

}
