
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hallgato
 */
public class Könyvem implements Comparable<Könyvem> {

    public String címe;
    public int év;
    private List<String> szerzők;

    public Könyvem(String címe, int év) {
        this.címe = címe;
        this.év = év;
        this.szerzők = new ArrayList<>();
    }

    public String getCíme() {
        return címe;
    }

    public void setCíme(String címe) {
        this.címe = címe;
    }

    public int getÉv() {
        return év;
    }

    public void setÉv(int év) {
        this.év = év;
    }

    public List<String> getSzerzők() {
        return szerzők;
    }

    public void setSzerzők(List<String> szerzők) {
        this.szerzők = szerzők;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.címe);
        hash = 97 * hash + Objects.hashCode(this.szerzők);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Könyvem)) {
            return false;
        }
        Könyvem k = (Könyvem) obj;

        return this.címe.equals(k.getCíme()) && this.szerzők.equals(k.getSzerzők());

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<this.szerzők.size();i++) {
            if(i<this.szerzők.size()-1){
            sb.append(this.szerzők.get(i)).append(", ");
            } else{
                sb.append(this.szerzők.get(i));
            }}
        if(!this.szerzők.isEmpty())
        sb.append(": ");

        sb.append(this.címe);
        sb.append("(").append(this.év).append(")");
        return sb.toString();
    }

    @Override
    public int compareTo(Könyvem o) {

        if (this.év == o.getÉv()) {
            if (this.szerzők.size() == o.getSzerzők().size()) {
                return this.címe.compareTo(o.getCíme());
            } else {
                return (-1) * Integer.compare(this.szerzők.size(), o.getSzerzők().size());
            }
        } else {
            return Integer.compare(this.év, o.getÉv());

        }
    }

}
