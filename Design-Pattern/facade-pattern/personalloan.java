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
public class personalloan {
    double amt=15000,r=7.4;
    int year=3;
    public double getintrestpersonalloan()
    {
        return (amt*r*year)/100;
    }
}
