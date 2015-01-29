/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package client;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author l1f09bscs2065
 */
public class Client {
public Client(){
		try
		{
			s = new Socket("localhost", 9999);
			oos = new ObjectOutputStream(s.getOutputStream());
                        ois = new ObjectInputStream(s.getInputStream());
		}
		catch (Exception err)
		{
			System.err.println(err);
		}
	}
public Boolean updateQry(String qry) throws Exception{
    Boolean result;
        try {
            oos.writeObject(new String(qry)); //---Send a string (good)
            s.shutdownOutput();
            
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    result = new Boolean((Boolean)ois.readObject());
    System.out.println(result);
    oos.close();
    ois.close();
    s.close();
  return result;
}
private Socket s;
private ObjectOutputStream oos;
private ObjectInputStream ois;
}
