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
public class Main {
    public static void main(String[] args){
        
        KerEgyseg[] ker=new KerEgyseg[]{
            new Pekseg("Aranycipó","Egy 1",new Date(), new String[]{"Kifli","Zsömle","Kenyér"})    
        };
        
        System.out.println(Arrays.toString(ker));
    }
    
}
