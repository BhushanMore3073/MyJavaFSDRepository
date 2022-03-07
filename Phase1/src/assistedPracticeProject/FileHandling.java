package assistedPracticeProject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		// Writing in the file

		try {
			FileWriter f = new FileWriter(
					"C:\\Users\\HP\\Desktop\\assignments_submission\\assignments\\Phase1\\src\\abc.txt");
			try {
				f.write("Bhushan is Full Stack Developer..!!");
			} finally {
				f.close();
			}
			System.out.println("Successfully Written..!! ");
		} catch (IOException i) {
			System.out.println(i);
		}

		// reading from the file
		try {
			FileReader r = new FileReader(
					"C:\\Users\\HP\\Desktop\\assignments_submission\\assignments\\Phase1\\src\\abc.txt");
			try {
				int i;
				while ((i = r.read()) != -1) {
					System.out.print((char) i);
				}
			} finally {
				r.close();
				System.out.print("\n");
				System.out.print("File Closed successfully.");
			}
		} catch (IOException e) {
			System.out.println("Exception handled..");
		}

	}

}
