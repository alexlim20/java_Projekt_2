import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.ArrayList;

/**
 * Write a description of class NutzerVerwaltung here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NutzerVerwaltung
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> accounts;

    /**
     * Constructor for objects of class NutzerVerwaltung
     */
    public NutzerVerwaltung()
    {
        // initialise instance variables
        accounts = new HashMap<String, String>() ;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void erstelleAccount(String name, String matrikelNummer, String passwort)
    {
        // put your code here
        accounts.put(erstelleKennung(name, matrikelNummer), passwort);
        
    }
    
    private String erstelleKennung(String name, String matrikelNummer)
    {
        return matrikelNummer.substring(0, 3) + name.substring(0, 4);
    }
    
    public String gibPasswort(String kennung)
    {
        String passwort = accounts.get(kennung);
        return passwort;
    }
    
    public void druckeInfos(String kennung)
    {
        System.out.println(kennung + " " + accounts.get(kennung));
    }
    
    public void druckeAccounts()
    {
        Set<String> key = accounts.keySet();
        for(String s : key)
        {
            System.out.println(s);
        }
    }
    
    public void druckePasswoerter()
    {
        Collection<String> pw= accounts.values();
        for (String p : pw)
        {
            System.out.println(p);
        }
    }
    
    public void druckeGesamtInfos()
    {
        Set<String> key = accounts.keySet();
        for (String s : key)
        {
            druckeInfos(s);
        }
    }
    
    public ArrayList<String> gibAccounts()
    {
        Collection<String> c = accounts.keySet();
        ArrayList<String> d = new ArrayList<String>(c);
        return d;
    }
    
    public ArrayList<String> gibPasswoerter()
    {
        Collection<String> c = accounts.values();
        ArrayList<String> d = new ArrayList<String> (c);
        return d;
    }
    
    public static void main(String [] args)
    {
        NutzerVerwaltung nutzer1 = new NutzerVerwaltung();
        
        nutzer1.erstelleAccount("alexa","884559","31003100");
        nutzer1.erstelleAccount("flora","123456","654321");
        nutzer1.erstelleAccount("david","741258","852147");
        
        nutzer1.druckeInfos("884alex");
        nutzer1.druckeInfos("123flor");
        nutzer1.druckeInfos("741davi");
        
        System.out.println();
        
        nutzer1.druckeAccounts();
        
        System.out.println();
        
        nutzer1.druckePasswoerter();
        
        System.out.println();
        
        nutzer1.druckeGesamtInfos();
    }
}
