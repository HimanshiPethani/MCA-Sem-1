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
public class ahemdabadwaterbill implements iwaterbill
{
    int unitsprice=10;
    int unituse=600;
    
    @Override
    public String customername()
    {System.out.println("Ahemdabad water bill customername: ");
        return "armi";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int customerno()
    {System.out.println("Ahemdabad water bill customerno ");
        return 1234567;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String customeraddress() {
        System.out.println("Ahemdabad water bill customeraddress ");
        return "moti bag";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int amount()
    {
        System.out.println("Ahemdabad water bill total ");
        return unitsprice*unituse;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
