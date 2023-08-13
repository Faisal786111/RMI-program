import java.rmi.*;
import java.io.*;

class Server{
	public static void main(String args[])throws Exception{
		Add obj = new Add();
		Naming.rebind("hello",obj);
		System.out.println("Server is created");
	}
}