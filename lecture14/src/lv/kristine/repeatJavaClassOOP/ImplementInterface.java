package lv.kristine.repeatJavaClassOOP;

public class ImplementInterface implements InterfaceClass{

	@Override
	public void sendEmail() {
		System.out.println("email@email.com");
		
	}
	
	public int sendEmailCount(){
		int i=0;
		return ++i;
		
	}
}
