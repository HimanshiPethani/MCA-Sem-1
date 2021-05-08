/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeclient;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Facadeclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.homeloan");
        System.out.println("2.personalloan");
        System.out.println("3.vehicalloan");
        int ch;
        System.out.println("choice eny number:");
        ch=sc.nextInt();
        facade f=new facade();
        f.getintrest(ch);
        // TODO code application logic here
    }
    
}
