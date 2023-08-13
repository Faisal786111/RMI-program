import java.rmi.*;
import java.io.*;

class Client{
	public static void main(String args[])throws Exception{
		SayHelloI obj = (SayHelloI) Naming.lookup("hello");
		String msg = obj.sayHello();
		System.out.println(msg);
	}
}