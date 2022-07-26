package week2.day4;


public class Employe {
	public void employename(String name) {
		System.out.println(name);		
    
	}
	public void employeid(int id) {
		System.out.println(id);
		
	}
	public void employeaddress(String address) {
		System.out.println(address);

	}
	public void employesalary(double salary) {
		System.out.println(salary);
		
	}
	public void employemobilenumber(long mobilenumber) {
		System.out.println(mobilenumber);
		
	}
	
	
	public static void main(String[] args) {
		Employe emp=new Employe();
		emp.employename("rajesh");
		emp.employeid(1234);
		emp.employeaddress("chennai");
		emp.employesalary(15000);
		emp.employemobilenumber(9790614060l);
	}

}
