package filesBasics;
import java.util.*;
import java.io.*;
public class FileDemo {
	//byte b1[]=new byte[10];
	void writeFile() throws FileNotFoundException {
		Scanner scan=new Scanner(System.in);
		FileOutputStream fo=new FileOutputStream("text2.text",true);
		String s="";
		System.out.println("enter message:");
		try {
			while(!s.equals("n")){
				//System.out.println("enter message:");
				s=scan.nextLine();
				if(!s.equals("n")) {
					fo.write(s.getBytes());
					fo.write("\r\n".getBytes());
				}
			}
			fo.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


	void readFile() throws FileNotFoundException {
FileInputStream f=new FileInputStream("text2.text");
try {
	byte[] b=new byte[100];
	f.read(b);
	String str=new String(b);
	System.out.println(str.trim());
	f.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileDemo obj=new FileDemo();
	obj.writeFile();
		obj.readFile();
	}

}
