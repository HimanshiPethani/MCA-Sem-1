/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeclient;

/**
 *
 * @author HP
 */
public class vehicalloan {
    double amt=13000,r=7.2;
    int year=2;
    public double getintrestvehicalloan()
    {
        return (amt*r*year)/100;
    }
}
