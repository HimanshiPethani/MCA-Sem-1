/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyclient;

/**
 *
 * @author Himansi
 */
public class Proxyclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        internent w=new webpageproxy();
        try
        {   w.doconnect("youtube.com");
            w.doconnect("gujaratvidyapith.org");
             w.doconnect("aaa.com");
             
        }
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
       
        
        // TODO code application logic here
    }
    
}
