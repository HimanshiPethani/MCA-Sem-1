/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_clientt;

/**
 *
 * @author Himansi
 */
public class Decorator_clientt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        chinesefood ch=new chinesefood();
        System.out.println(ch.preparefood());
        System.out.println(ch.foodprice());
        
        food f=new chinesebhel(new chinesenoodles(new chinesefood()));
        System.out.println(f.preparefood());
        System.out.println(f.foodprice());
        // TODO code application logic here
    }
    
}
