import java.rmi.server.*;
import java.io.*;

class SayHello  extends UnicastRemoteObject implements SayHelloI{
	SayHello()throws Exception{
		super();
	}
	public String sayHello(){
		return "hello gpm";
	}
}