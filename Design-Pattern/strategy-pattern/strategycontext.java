/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyclient;

/**
 *
 * @author Himansi
 */
public class strategycontext
{
    private propretytxt pt;
    public strategycontext(propretytxt pt)
    {
       this.pt=pt;
      
    }
    public double executeStrategy()
    {
        return pt.getpropretytxt();
    }
    
}
