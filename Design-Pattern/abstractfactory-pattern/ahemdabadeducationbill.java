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
public class ahemdabadeducationbill implements ieducationbill{

    
   int fees=22000;
   int year=3;
    @Override
    public String studentname() {
        System.out.println("ahemdabad educationbill customername");
        return "aayu";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int studentno() 
    {
        System.out.println("ahemdabad educationbill customerno");
        return 2345678;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String clgname()
    {
        System.out.println("ahemdabad educationbill collagename");
        return "gujrat vidhyapith";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int totalfee() {
        System.out.println("ahemdabad educationbill totalfees");
        return fees*year;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
