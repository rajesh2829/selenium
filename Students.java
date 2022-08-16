package overloading;

public class Students {
	public void getstudentinfo(int id) {
		System.out.println("id "+id);
		
	}
	public void getstudentinfo(int id,String name) {
		System.out.println("id-"+id+ "name-"+name);
		
	}
	public void getstudentinfo(int id,String name,String mail) {
		System.out.println("id-"+id+"name-"+name+"mail-"+mail);
		
	}

	public static void main(String[] args) {
		Students oo7=new Students();
		oo7.getstudentinfo(6);
		oo7.getstudentinfo(3, "raji");
		oo7.getstudentinfo(28, "raji", "raji@123");

	}

}
