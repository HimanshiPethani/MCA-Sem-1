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
public class chinesenoodles extends decoratorfood{
    
    public chinesenoodles(food f) {
        super(f);
    }
    @Override
    public String preparefood() {
        return super.preparefood()+"with chinesenoodle";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double foodprice() {
        return super.foodprice()+200;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
