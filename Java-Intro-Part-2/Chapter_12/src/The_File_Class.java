/*
 * The_File_Class.java
 * 
 * file stuff program 
 * 
 * 
 * import java.io.File;
 * 
 * File myFile = new File("path name");
 * --> if using back slash  you MUST use 2 --> \\
 * 
 * 
 * absolute and relative paths
 * 
 * use try catch blocks when reading from files 
 * 
 * PrintWriter Class for writing to files 
 * 
 */
import java.io.File;
import java.util.Scanner;

public class The_File_Class {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean finished = false;
		
		while (!finished) {
			System.out.print("Enter a file name: ");
			String fileName = input.nextLine();
			
			if (!fileName.equals("")) {
				File file = new File(fileName);
				System.out.println("Does it exist? "     + file.exists());
				System.out.println("Is it a directory? " + file.isDirectory());
				System.out.println("Is it a file?"       + file.isFile());
				System.out.println("File size: "         + file.length() + " bytes ");
				System.out.println("Can it be read? "    + file.canRead());
				System.out.println("Can it be written? " + file.canWrite());
				System.out.println("Absolute path? "     + file.isAbsolute());
				System.out.println("Is it hidden? "      + file.isHidden());
				System.out.println("Last modified: " + 
						new java.util.Date(file.lastModified()));
				System.out.println("Full path name: " + file.getAbsolutePath());
				System.out.println();
			} else {
				finished = true;
			}
			
		}
		
		/*
		 * Reading Files: 
		 * 
		 * File fileVariableName = new File("file.txt);
		 * 
		 * Scanner input = new Scanner(fileVariableName);
		 * 
		 * while (input.hasNext()) {
		 * 	   String line = input.nextLine();
		 *     dataType variable = DataType.valueOf(line); 
		 *     do some stuff
		 * } 
		 * input.close();
		 * 
		 */
		
		/*
		 * Writing TO Files: 
		 * 
		 * import java.util.Scanner;
		 * import java.io.File;
		 * import java.io.FileNotFoundException;
		 * import java.io.PrintWriter;
		 * 
		 * 
		 * 
		 * File inFile = new File("file.txt");
		 * File outFile = new File("new_file.txt);
		 * 
		 * try {
		 *     Scanner input = new Scanner(inFile);
		 *     PrintWriter output = new PrintWriter(outFile);
		 *     
		 *     while (input.hasNext()) {
		 *         String line = input.nextLine();
		 *         do 
		 *             some
		 *                 stuff
		 *         output.write(newName + "\n");
		 *     }
		 *     input.close();
		 *     output.close();
		 * }
		 * catch (FileNotFoundException e) {
		 *     System.out.println(e.getMessage());
		 * }
		 * 
		 */
		
		
	}

}
