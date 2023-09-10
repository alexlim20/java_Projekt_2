
/**
 * Beschreiben Sie hier die Klasse Test.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Test
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
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
