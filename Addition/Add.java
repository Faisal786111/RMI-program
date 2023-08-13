import java.rmi.server.*;
import java.io.*;

class Add extends UnicastRemoteObject implements AddI{
	Add()throws Exception{
		super();
	}
	public int add(int a , int b){
		return a + b;
	}
}