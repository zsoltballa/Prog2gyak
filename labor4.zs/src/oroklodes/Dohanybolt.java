/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oroklodes;
import java.util.Date;

/**
 *
 * @author hallgato
 */
public class Dohanybolt extends KerEgyseg{
    private String [] dohánycikk;

    public Dohanybolt(String név, String cím, Date dateCreated, String [] d) {
        super(név, cím, dateCreated);
    }

    public String[] getDohánycikk() {
        return dohánycikk;
    }

    @Override
    public String toString() {
        return super.toString() + "Dohanybolt{" + "doh\u00e1nycikk=" + dohánycikk + '}';
    }
    
    
    
}
