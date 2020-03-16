package tm.java.oops;

public class Aadhar {
	
	private String name;
	private int age;
	private String address;
	
	//setters - to assign data to private variables from other classes
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//getters - to get private variables data from other classes
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}

}
