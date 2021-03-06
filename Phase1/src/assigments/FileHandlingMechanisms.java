//To create a file
package assigments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



class FileOperations {
	
	String path = "C://Users//HP//Desktop//assignments_submission//assignments//Phase1//src//";
	public void createFileUsingFileClass(String filename) throws IOException {
		File file = new File(path+filename);

		// Create the file
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Test data");
		writer.close();
	}

	public void createFileUsingFileOutputStreamClass(String filename) throws IOException {
		String data = "Test data";
		FileOutputStream out = new FileOutputStream(path+filename);
		out.write(data.getBytes());
		out.close();
	}

	public void createFileIn_NIO(String filename) throws IOException {
		String data = "Test data";
		Files.write(Paths.get(path+filename), data.getBytes());
		List<String> lines = Arrays.asList("1st line", "2nd line");
		Files.write(Paths.get("file6.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

	//To read a file 
	public List<String> readFileInList(String fileName) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(path+fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	//To update a file
	public void modifyFile(String filename, String newString) {
		File fileToBeModified = new File(path+filename);
		String oldContent = "";
		BufferedReader reader = null;
		FileWriter writer = null;
		try {
			reader = new BufferedReader(new FileReader(fileToBeModified));
			String line = reader.readLine();
			while (line != null) {
				oldContent = oldContent + line + System.lineSeparator();
				line = reader.readLine();
			}
			//String newContent = oldContent.replaceAll(oldString, newString);
			String newContent = oldContent.concat(newString);
			writer = new FileWriter(fileToBeModified);
			writer.write(newContent);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	//To delete a file
	public void deletefile(String filename) {
		try {
			Files.deleteIfExists(Paths.get(path+filename));
		} catch (NoSuchFileException e) {
			System.out.println("No such file/directory exists");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
		} catch (IOException e) {
			System.out.println("Invalid permissions.");
		}

		System.out.println("Deletion successful.");
	}
}

public class FileHandlingMechanisms {
	public static void main(String[] args) {
		FileOperations fo = new FileOperations();
		
		try 
		{
			fo.createFileUsingFileClass("abc.txt");
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		int i=10;
		while(i-->0)
			fo.modifyFile("abc.txt", new Scanner(System.in).nextLine()+"\n");
		fo.readFileInList("abc.txt").forEach(e->System.out.println(e));
//		fo.deletefile("abc.txt");
	}
}
