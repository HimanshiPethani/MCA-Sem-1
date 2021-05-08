/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyclient;

/**
 *
 * @author Himansi
 */
public class Strategyclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        strategycontext sc=new strategycontext(new residential());
        System.out.println("residential tax= " + sc.executeStrategy());
        
        sc=new strategycontext(new commercial());
         System.out.println("commercial tax= " + sc.executeStrategy());
         
          sc=new strategycontext(new education());
         System.out.println("education tax= " + sc.executeStrategy());
         
          sc=new strategycontext(new hospital());
         System.out.println("hospital tax= " + sc.executeStrategy());
         
        // TODO code application logic here
    }
    
}
