package lv.kristine.repeatJavaClassOOP;

public class MyClassConstructor {

	private long modelYear;
	private String modelNAme;

	public MyClassConstructor() { //default constructor

	}

	public MyClassConstructor(long modelYear, String modelNAme) {
		this.modelYear = modelYear;
		this.modelNAme= modelNAme;
		
	}

	public String getModelNAme() {
		return modelNAme;
	}

	
	
}
