package lv.kristine.user;

public class Person {

	public String name;
	public String address;

	public Person(String vards, String adrese) {
		this.name = name;
		this.address = address;

	}

	public String toString(){
		return name+"("+address+")";
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

}
