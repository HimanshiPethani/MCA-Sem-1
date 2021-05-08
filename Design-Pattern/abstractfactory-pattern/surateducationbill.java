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
public class surateducationbill implements ieducationbill{

   int fees=42000;
   int year=3;
    @Override
    public String studentname() {
        System.out.println("surat educationbill customername");
        return "pihu";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int studentno() 
    {
        System.out.println("surat educationbill customerno");
        return 2345678;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String clgname()
    {
        System.out.println("surat educationbill collage name");
        return "nirma clg";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int totalfee() {
        System.out.println("surat educationbill  totalbill");
        return fees*year;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
