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
public class factoryeducationbill extends abstractfactorybill
{@Override
    public iwaterbill getwaterbill(int i) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ielectricitybill getelectricitybill(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ieducationbill geteducationbill(int i)
    { if(i==1)
        {
             return new ahemdabadeducationbill();
        }
        else if(i==2)
        {
            return new rajkoteducationbill();
        }
        else if(i==3)
        {
            return new surateducationbill();
        }
        else
        {
            return null;
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
