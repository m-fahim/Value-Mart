/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import com.sun.rowset.internal.CachedRowSetWriter;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author l1f09bscs2065
 */
public class Server {
    public Server(){
		try{
			ServerSocket ss = new ServerSocket(9999);
                        JOptionPane.showMessageDialog(new JFrame(), "Server :: is waiting for requests.");
			while(true){
                        Socket s = new Socket();s = ss.accept();
                        JOptionPane.showMessageDialog(new JFrame(), "Client :: request for services.");
                        ServerThread t = new ServerThread(s);    // make a thread of it
			JOptionPane.showMessageDialog(new JFrame(), "Starting a thread for a new Client");
			t.start();
                        }
                }catch(Exception e){
                    System.out.println("yes1 : "+e);
                        }	
    }
}
/** One instance of this thread will run for each client */
class ServerThread extends Thread {
		// the socket where to listen/talk
		private Socket s;
		private ObjectInputStream ois;
		private ObjectOutputStream oos;
                private String newQry;
		
		ServerThread(Socket socket) {
                        this.s = new Socket();
			this.s = socket;
		}
    @Override
	public void run() {
            try{
                        ois = new ObjectInputStream(s.getInputStream());
                        oos = new ObjectOutputStream(s.getOutputStream());
			//---Get the Query (should be okay)
                        newQry = new String((String)ois.readObject());
                        Database dB = new Database();
                        Boolean reQry = new Boolean(dB.updateQry(newQry));
                        //System.err.println(i);
                        //System.out.println(retype);
			oos.writeObject(reQry);
                        //System.err.println(reQry);
                        //oos.flush();
			//---Get the integer (should fail & throw an exception)
			//Integer badVal = (Integer)ois.readObject();
			//System.err.println(badVal.toString());
                        ois.close();
                        oos.close();
			s.close();
                }catch(Exception e){
                    System.out.println("yes2 : "+e);
                }
          }
}			
