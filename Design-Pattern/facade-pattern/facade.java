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
public class facade  
{
    Scanner sc=new Scanner(System.in);
    
    //int ch;
    
   public void getintrest(int ch)
   {
       if(ch==1)
       {
            homeloan h=new homeloan();
           System.out.println("homeloan:"+h.getintresthomeloan());
       }else if(ch==2)
       {
           personalloan p=new personalloan();
           System.out.println("personalloan:"+p.getintrestpersonalloan());
       }
       else
       {
           vehicalloan v=new vehicalloan();
           System.out.println("vehicalloan:"+v.getintrestvehicalloan());
       }
   }
}
