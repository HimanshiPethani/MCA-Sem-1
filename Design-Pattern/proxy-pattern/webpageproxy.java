/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyclient;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Himansi
 */
public class webpageproxy implements internent
{
    private internent internent= new webpageimp();
     private static List<String> bannedsites; 
      
    static
    { 
        bannedsites = new ArrayList<String>(); 
        bannedsites.add("aaa.com"); 
        bannedsites.add("bbb.com");
        bannedsites.add("ccc.org"); 
        bannedsites.add("ddd.com");
        bannedsites.add("hhh.com"); 
        bannedsites.add("kkk.com"); 
        bannedsites.add("ppp.com"); 
        
       
    } 
    @Override
    public void doconnect(String pageurl) throws Exception 
    {
        if(bannedsites.contains(pageurl.toLowerCase())) 
        { 
            throw new Exception("site is banned"); 
        } 
          
        internent.doconnect(pageurl); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
