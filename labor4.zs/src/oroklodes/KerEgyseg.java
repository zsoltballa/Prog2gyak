/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oroklodes;
import java.util.Date;

import java.util.Objects;

/**
 *
 * @author hallgato
 */
public class KerEgyseg {
    String név;
    String cím;
    Date dateCreated;

    public KerEgyseg(String név, String cím, Date dateCreated) {
        this.név = név;
        this.cím = cím;
        this.dateCreated = dateCreated;
    }

    public String getNév() {
        return név;
    }

    public String getCím() {
        return cím;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }


    @Override
    public boolean equals(Object obj) {
        
        if (obj == null || !(obj instanceof KerEgyseg)){
            return false;
        }
        
        KerEgyseg k=(KerEgyseg)obj;
        
        return this.cím.equals(k.getCím()) && this.getDateCreated().equals(k.getDateCreated());
    }

    @Override
    public String toString() {
        return "KerEgyseg{" + "n\u00e9v=" + név + ", c\u00edm=" + cím + ", dateCreated=" + dateCreated + '}';
    }
}
