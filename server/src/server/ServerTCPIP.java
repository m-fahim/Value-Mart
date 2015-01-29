/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

import java.net.*;
import java.io.*;


/**
 *
 * @author l1f09bscs2065
 */
public class ServerTCPIP {
// the socket used by the server
	private ServerSocket serverSocket;
	// server constructor
	ServerTCPIP(int port) {
		
		/* create socket server and wait for connection requests */
		try 
		{
			serverFrame sFrame = new serverFrame();
                        sFrame.setVisible(true);
                        serverSocket = new ServerSocket(port);
			System.out.println("Server waiting for client on port " + serverSocket.getLocalPort());

			while(true) 
			{
				Socket socket = serverSocket.accept();  // accept connection
				System.out.println("New client asked for a connection");
				TcpThread t = new TcpThread(socket,sFrame);    // make a thread of it
				System.out.println("Starting a thread for a new Client");
				t.start();
			}
		}
		catch (IOException e) {
			System.out.println("Exception on new ServerSocket: " + e);
		}
	}		

	
	/** One instance of this thread will run for each client */
	class TcpThread extends Thread {
		// the socket where to listen/talk
		Socket socket;
                serverFrame sF;
		ObjectInputStream Sinput;
		ObjectOutputStream Soutput;
		
		TcpThread(Socket socket, serverFrame sF) {
			this.socket = socket;
                        this.sF = sF; 
                        //this.sF.setInsertStatus("Connected from " + this.socket .getInetAddress() + " on port "+ this.socket .getPort() + " to port " + this.socket .getLocalPort() + " of "+ this.socket .getLocalAddress());
		}
        @Override
		public void run() {
			/* Creating both Data Stream */
			System.out.println("Thread trying to create Object Input/Output Streams");
			try
			{
				// create output first
				Soutput = new ObjectOutputStream(socket.getOutputStream());
				//Soutput.flush();
				Sinput  = new ObjectInputStream(socket.getInputStream());
			}
			catch (IOException e) {
				System.out.println("Exception creating new Input/output Streams: " + e);
				return;
			}
			System.out.println("Thread waiting for a Request from the Client");
			// read a String (which is an object)
			try {
				String str = new String((String) Sinput.readObject());
				//str = str.toUpperCase();
                                Database dB = new Database();
                                if(isINSERT(str) == true){
                                    this.sF.setInsertStatus("Connected from " + this.socket .getInetAddress() + " on port "+ this.socket .getPort() + " to port " + this.socket .getLocalPort() + " of "+ this.socket .getLocalAddress());
                                    sF.setInsertStatus("Thread Successfull in Insertion. \n\n");
                                    Boolean response = dB.updateQry(str);
                                    Soutput.writeObject(response);
                                }else if(isUPDATE(str) == true){
                                    this.sF.setUpdateStatus("Connected from " + this.socket .getInetAddress() + " on port "+ this.socket .getPort() + " to port " + this.socket .getLocalPort() + " of "+ this.socket .getLocalAddress());
                                    sF.setUpdateStatus("Thread Successfull in Updating. \n\n");
                                    Boolean response = dB.updateQry(str);
                                    Soutput.writeObject(response);
                                }else if(isDELETE(str) == true){
                                    this.sF.setDeleteStatus("Connected from " + this.socket .getInetAddress() + " on port "+ this.socket .getPort() + " to port " + this.socket .getLocalPort() + " of "+ this.socket .getLocalAddress());
                                    sF.setDeleteStatus("Thread Successfull in Deleting. \n\n");
                                    Boolean response = dB.updateQry(str);
                                    Soutput.writeObject(response);
                                }/*else if(isSELECT(str) == true){
                                }*/
                                //Boolean response = dB.updateQry(str);
				//Soutput.writeObject(response);
				//Soutput.flush();
			}
			catch (IOException e) {
				System.out.println("Exception reading/writing  Streams: " + e);
				return;				
			}
			// will surely not happen with a String
			catch (ClassNotFoundException o) {				
			}
			finally {
				try {
					Soutput.close();
					Sinput.close(); 
				}
				catch (Exception e) {					
				}
			}
		}
                public Boolean isINSERT(String string) {
                  //int result;
                  //String comString;
                    int start = string.indexOf("INSERT");
                    //int end = string.lastIndexOf("INSERT");
                    //comString = new String(string.substring(start+1, end));
                    //System.out.println(comString);
                    //result = comString.compareTo("INSERT");
                    if(start == -1)
                        return false;
                    else 
                        return true;
                }
                public Boolean isUPDATE(String string) {
                  //int result;
                  //String comString;
                    int start = string.indexOf("UPDATE");
                    //int end = string.lastIndexOf("INSERT");
                    //comString = new String(string.substring(start+1, end));
                    //System.out.println(comString);
                    //result = comString.compareTo("INSERT");
                    if(start == -1)
                        return false;
                    else 
                        return true;
                }
                public Boolean isDELETE(String string) {
                  //int result;
                  //String comString;
                    int start = string.indexOf("DELETE");
                    //int end = string.lastIndexOf("INSERT");
                    //comString = new String(string.substring(start+1, end));
                    //System.out.println(comString);
                    //result = comString.compareTo("INSERT");
                    if(start == -1)
                        return false;
                    else 
                        return true;
                }/*
                public Boolean isSELECT(String string) {
                  //int result;
                  //String comString;
                    int start = string.indexOf("SELECT");
                    //int end = string.lastIndexOf("INSERT");
                    //comString = new String(string.substring(start+1, end));
                    //System.out.println(comString);
                    //result = comString.compareTo("INSERT");
                    if(start == -1)
                        return false;
                    else 
                        return true;
                }*/
	}

}
