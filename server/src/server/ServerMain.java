/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package server;

/**
 *
 * @author mfahim
 */
public class ServerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        choiceFrame cFrame = new choiceFrame();
        cFrame.setVisible(true);
        ServerTCPIP s = new ServerTCPIP(9999);
    }

}
