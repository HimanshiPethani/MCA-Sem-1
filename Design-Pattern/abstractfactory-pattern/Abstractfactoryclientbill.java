/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryclientbill;

/**
 *
 * @author Himansi
 */

import java.util.Scanner;
public class Abstractfactoryclientbill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        abstractfactorybill ab;
        int choice,choice1;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.waterbill");
         System.out.println("2.electricitybill");
          System.out.println("3.educationbill");
          
          System.out.println("chose any bill:-");
          choice=sc.nextInt();
          
          System.out.println("1.ahemdabad");
          System.out.println("2.rajkot");
          System.out.println("3.surat");
          System.out.println("choice any city:");
          choice1=sc.nextInt();
          
          
          ab=abstractfactorybill.getfactory(choice);
          if(choice==1)
          {
              iwaterbill iw=ab.getwaterbill(choice1);
              
             System.out.println(iw.customername());
             System.out.println( iw.customerno());
             System.out.println(iw.amount());
             System.out.println( iw.customeraddress());
         
          }
          else if(choice==2)
          {
              ielectricitybill ie=ab.getelectricitybill(choice1);
               System.out.println(ie.customername());
               System.out.println( ie.customerno());
               System.out.println(ie.amount());
               System.out.println( ie.customeraddress());
          }
          else
          {
              ieducationbill ied=ab.geteducationbill(choice1);
              System.out.println(ied.studentname());
              System.out.println(ied.studentno());
              System.out.println(ied.totalfee());
              System.out.println(ied.clgname());
          }
        // TODO code application logic here
    }
    
}
