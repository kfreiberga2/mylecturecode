package lv.kristine.bookstore;

public class Author {

	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gens) {
		super();
		this.name = name;
		this.email = email;
		
		if (checkGender(gens)) {
			this.gender = gens;
		}else{
			this.gender = 'x';
		}
	}

	public Author (String name){
		
	}
	
	public static boolean checkGender(char gen) {
		char m = 'm';
		char f = 'f';

		if (m == gen || f == gen) {
			System.out.println("it is M of F");
			return true;
		} else {
			return false;
		}
	}

	
	
	public String getEmail() {
		return email;
		}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender="
				+ gender + "]";
	}

}
