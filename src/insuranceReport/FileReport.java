package insuranceReport;

import insuranceController.Controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileReport {

	public void saveFile(Object oj)
	{
		try {
			   FileOutputStream os = new FileOutputStream("report.txt");
			   ObjectOutputStream obj = new ObjectOutputStream(os);
			   obj.writeObject(oj);
			   obj.close();
			   //System.out.println(oj);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void readFile()
	{
	  	try {
			  FileInputStream  is	= new FileInputStream("C:\\Users/JIA/Documents/GitHub/MiniProj_1/report.txt");
			  ObjectInputStream object = new ObjectInputStream(is);
			   //System.out.println(object.readObject());
			  object.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
