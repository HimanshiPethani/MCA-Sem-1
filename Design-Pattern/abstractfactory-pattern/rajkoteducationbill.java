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
public class rajkoteducationbill implements ieducationbill {

  int fees=20000;
   int year=2;
    @Override
    public String studentname() {
        System.out.println("rajkot educationbill customername");
        return "aarohi";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int studentno() 
    {
        System.out.println("rajkot educationbill customerno");
        return 2345678;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String clgname()
    {
        System.out.println("rajkot educationbill collagename");
        return "gujrat univercity";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int totalfee() {
        System.out.println("rajkot educationbill totalfees");
        return fees*year;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
