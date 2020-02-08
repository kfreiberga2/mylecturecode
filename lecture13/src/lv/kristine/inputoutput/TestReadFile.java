package lv.kristine.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestReadFile {

	public static void main(String[] args) {

		InputStream inputStream;
		OutputStream outputStream;
		int c;
		final int EOF = -1;

		outputStream = System.out;

		try {
			File inputFile = new File("Data.txt");
			inputStream = new FileInputStream(inputFile);

			try {
				while ((c = inputStream.read()) != EOF)
					outputStream.write(c);

			} catch (IOException e) {
				System.out.println("eror: " + e.getMessage());
			} finally {
				try {
					inputStream.close();
					outputStream.close();

				} catch (IOException e) {
					System.out.println("file did not clode");
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
