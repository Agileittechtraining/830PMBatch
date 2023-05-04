package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Filehandling {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
File f = new File("C:\\Filehandling\\myfile.txt"); //constructor
f.createNewFile();
FileWriter fw = new FileWriter(f);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Hello hi");
bw.newLine();
bw.write("How are you");
bw.close();
}
}