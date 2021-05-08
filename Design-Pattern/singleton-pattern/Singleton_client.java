/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_client;

/**
 *
 * @author Himansi
 */
public class Singleton_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        threadclass t=new threadclass("himashi");
        threadclass t1=new threadclass("niya");
        t.run();
        t1.run();
        // TODO code application logic here
    }
    
}
