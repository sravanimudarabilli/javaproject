package task3;
import java.io.*;
import java.util.Scanner;
public class Demo {
	//byte[] b=new byte[10];
	void writeData() {
		try {
			//System.in.read(b);
			Scanner s=new Scanner(System.in);
			FileOutputStream fout=new FileOutputStream("text1.text",true);
			String str=s.nextLine();
			fout.write(str.getBytes());
			fout.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	void readData() throws IOException {
		
		FileInputStream fout;
		try {
			fout = new FileInputStream("text1.text");
			fout.read(b);
			String str=new String(b);
			System.out.println(str.trim());
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//String str=new String(b);
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.writeData();
		//obj.readData();
	}

}
