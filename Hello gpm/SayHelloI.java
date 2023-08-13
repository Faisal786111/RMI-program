import java.rmi.*;
import java.io.*;

interface SayHelloI extends Remote{
	public String sayHello() throws Exception;
}