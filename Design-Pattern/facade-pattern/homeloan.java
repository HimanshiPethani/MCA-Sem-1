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
public class homeloan 
{
    double amt=5000,r=8.4;
    int year=4;
    public double getintresthomeloan()
    {
        return (amt*r*year)/100;
    }
}
