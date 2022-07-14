import java.net.*;
import java.io.*;

public class honorathe_client{
	public static void main(String[] args) throws IOException{
		//client requestconnection to server
		Socket  hono = new Socket("localhost",6666);
		// client send infromation to server
		PrintWriter myclient = new PrintWriter(hono.getOutputStream());
		myclient.println("is it working ?");
		myclient.flush();// when there are any data that can not sent immediatly flush help to send them any time.

		// client receive information from server
		InputStreamReader xavier= new InputStreamReader(hono.getInputStream()); // function which recieve the message from server
   
    BufferedReader bf = new BufferedReader(xavier);// store the message that sent by server

      String str = bf.readLine(); //read message

  System.out.println("message from server :"+ str);//display messages
// client send infromation to server
 PrintWriter mmessage = new PrintWriter(hono.getOutputStream());
		mmessage.println("thank you server ");
		mmessage.flush();

	InputStreamReader xavier1= new InputStreamReader(hono.getInputStream()); // function which recieve the message from server
       BufferedReader bf1 = new BufferedReader(xavier1);// store the message that sent by server
         String str1 = bf1.readLine(); //read message
       System.out.println("message from server :"+ str1);//display messages
	}
}