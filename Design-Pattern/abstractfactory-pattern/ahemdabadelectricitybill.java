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
public class ahemdabadelectricitybill implements ielectricitybill{

    int unitprice=20;
    int unituse=220;
    @Override
    public String customername() {
        System.out.println("ahemdabad electricitybill customername");
        return "niya";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int customerno() 
    {
        System.out.println("ahemdabad electricitybill customerno");
        return 2345678;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String customeraddress()
    {
        System.out.println("ahemdabad electricitybill customeraddress");
        return "mheta nagar";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int amount() {
        System.out.println("ahemdabad electricitybill totalbill");
        return unitprice*unituse;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
