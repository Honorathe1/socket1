import java.net.*;
import java.io.*;

public class xavier_server{
	public static void main(String[] args) throws IOException{
		//server gives permision for to connect
		ServerSocket xavi = new ServerSocket(6666);
		//displayed that client is connected
	Socket hono= xavi.accept();//socket
	System.out.println("honorathe client is connected"); //output to server
	// server receive information from client
	// this is function help to reciev information /message from client to the server
	InputStreamReader xavier= new InputStreamReader(hono.getInputStream());
       BufferedReader bf = new BufferedReader(xavier);
       String str = bf.readLine(); 
       System.out.println("My client ask :"+ str);
 // gives feedback to my client 
 PrintWriter myclient = new PrintWriter(hono.getOutputStream());
		myclient.println("yes");
		myclient.flush();
		// server receive information from client
InputStreamReader xav= new InputStreamReader(hono.getInputStream());
     BufferedReader bf1 = new BufferedReader(xav);
     String strg = bf1.readLine(); 
     System.out.println("My client answer to  me :"+ strg); 

PrintWriter myclient1 = new PrintWriter(hono.getOutputStream());
		myclient1.println("okay");
		myclient1.flush();
	}
}
