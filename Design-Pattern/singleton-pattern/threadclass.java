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
public class threadclass {
    String name;
    public threadclass(String name)
    {
        this.name=name;
    }
    public void run()
    {
        try
        {
           singleton s=singleton.getinstance(name);
           s.dispaly();
        }
        catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
    }
}
