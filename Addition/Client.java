import java.rmi.*;
import java.io.*;

class Client{
	public static void main(String args[])throws Exception{
		AddI obj = (AddI) Naming.lookup("hello");
		int c = obj.add(10,20);
		System.out.println("Addition is : "+c);
	}
}