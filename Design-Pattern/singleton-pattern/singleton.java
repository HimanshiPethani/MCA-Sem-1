/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton_client;

/**
 *
 * @author Himansi
 */
public class singleton {
    private static singleton s;
    public static String name1;
    private singleton()
    {
        
    }
    public static singleton getinstance(String name)
    {
        if(s==null)
        {
            name1=name;
            s=new singleton();
        }
        return s;
    }
    public void dispaly()
    {
        System.out.println(name1+"only one instance create");
    }
    
}
