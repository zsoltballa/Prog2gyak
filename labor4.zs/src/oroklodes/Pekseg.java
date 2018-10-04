/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oroklodes;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author hallgato
 */
public class Pekseg extends KerEgyseg {
    
    private String [] pékáru;
    
    public Pekseg(String név, String cím, Date dateCreated, String [] p){
        super(név, cím, dateCreated);
        this.pékáru=p;
    }

    public String[] getPékáru() {
        return pékáru;
    }

    @Override
    public String toString() {
        return super.toString() + "Pekseg{" + "p\u00e9k\u00e1ru=" + pékáru + '}';
    }

    

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Pekseg)) {
            return false;
        }
        
        Pekseg p=(Pekseg)obj;
        
        return super.equals(p) && Arrays.equals(this.pékáru, p.getPékáru());
    }
    
    
    
    
}
