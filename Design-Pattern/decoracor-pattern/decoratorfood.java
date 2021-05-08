/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_clientt;

/**
 *
 * @author Himansi
 */
public class decoratorfood implements food{
    private food f;

    public decoratorfood(food f) 
    {
        this.f=f;
    }
    
    @Override
    public String preparefood() {
        return f.preparefood();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double foodprice() {
        return f.foodprice();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
