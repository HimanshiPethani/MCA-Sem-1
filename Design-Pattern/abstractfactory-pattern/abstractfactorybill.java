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
public abstract class abstractfactorybill
{
    public abstract iwaterbill getwaterbill(int i);
    public  abstract ielectricitybill getelectricitybill(int i);
    public abstract ieducationbill geteducationbill(int i);
     public static abstractfactorybill getfactory(int i)
     {
         if(i==1)
         {
             return new factorywaterbill();
         }
         else if(i==2)
         {
             return new factoryelectricitybill();
         }
         else if(i==3)
         {
             return new factoryeducationbill();
         }
         else
         {
             return null;
         }
         
     }
}
