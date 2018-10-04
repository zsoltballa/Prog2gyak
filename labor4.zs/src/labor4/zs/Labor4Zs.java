/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labor4.zs;

/**
 *
 * @author hallgato
 */
public class Labor4Zs {
    
    private static boolean palindrom(int szám){
        int másolat=szám;
        int újszám=0;
        int szj;
        while(szám>0){
            szj=szám%10;
            szám=szám/10;
            újszám=újszám*10+szj;
        }
        
        return újszám==másolat;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s1="Welcome to Java";
        String s2=s1;
        String s3=new String("Welcome to Java");
        String s4="Welcome to Java";
        String s5="semmi";
            
//      System.out.println(s1==s2);
//      System.out.println(s2==s3);
//      System.out.println(s1==s4);
            
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s3)); 
//            
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s2.compareTo(s3));
//        System.out.println(s2.compareTo(s5));
//        System.out.println("almafa".compareTo("ALMAFE"));

//        System.out.println(s1.charAt(0));
//        System.out.println(s1.indexOf('j'));
//        System.out.println(s1.indexOf("om"));
    }
    
}
