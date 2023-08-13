import java.rmi.*;
import java.io.*;

interface AddI extends Remote{
	public int add(int a,int b) throws Exception;
}