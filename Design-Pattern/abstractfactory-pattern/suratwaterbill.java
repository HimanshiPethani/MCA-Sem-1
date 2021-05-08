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
public class suratwaterbill implements iwaterbill{

   int unitprice=20;
int unituse=220;
    @Override
    public String customername() {
        System.out.println("surat waterbill customername");
        return "dhyana";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int customerno() 
    {
        System.out.println("surat waterbill customerno");
        return 2345678;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String customeraddress()
    {
        System.out.println("surat waterbill customeraddress");
        return "katargam";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int amount() {
        System.out.println("surat waterbill totalbill");
        return unitprice*unituse;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
