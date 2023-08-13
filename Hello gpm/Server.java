import java.rmi.*;
import java.io.*;

class Server{
	public static void main(String args[])throws Exception{
		SayHello obj = new SayHello();
		Naming.rebind("hello",obj);
		System.out.println("Server is created!!");

	}
}