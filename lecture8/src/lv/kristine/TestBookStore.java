package lv.kristine;

import lv.kristine.bookstore.Author;
import lv.kristine.bookstore.Book;

public class TestBookStore {

	
	public static void main(String[] args) {
		
		Author rowling = new Author ("J.K.Rowling","rowl@gmail.com",'f');
		Author rainis = new Author ("Rainis","rainis@gmail.com",'f');
		System.out.println(rowling.getEmail());
		rowling.setEmail("ggg@gmail.com");
		System.out.println(rowling.getEmail());
		
		
		 Book harrypotter = new Book ("Harry Poter", rowling, 20.2,1000);
		 System.out.println(harrypotter.toString());
		 
		 Author test20 = new Author("Test20");
		
		 
		
		
		
		System.out.println("---------------------------------------------");
		
		Author test1 = new Author("name", "name@name", 'f');
		System.out.println(test1.toString());
		System.out.println("-------------------------------------------------");
		
		Author test2 = new Author("name1", "name1@name", 'm');
		System.out.println(test2.toString());
		
		
	
		
		
		
		
	//	char m = 'm';
	//	char f = 'f';
	//	char kk = 'u';
		
//		if (m==kk || f==kk){
//			System.out.println("it is M of F");
//		
//		}else{
//			System.out.println("wrong data");
//		}
		
//		switch (kk){
//		case 'm' :
//			System.out.println("its M");
//			break;
//		case 'f':
//			System.out.println("its F");
//			break;
//		default:
//			System.out.println("Not in list");
//		}
		
		
	}

}
