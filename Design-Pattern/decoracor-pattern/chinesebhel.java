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
public class chinesebhel extends decoratorfood{
    
    public chinesebhel(food f) {
        super(f);
    }
    @Override
    public String preparefood() {
        return super.preparefood()+"with chinesebhel";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double foodprice() {
        return super.foodprice()+300;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
