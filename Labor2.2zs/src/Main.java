/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Main {
    
    public static int lnko(int a, int b)
    {
        int r;
        
        do{
            r=a%b;
            a=b;
            b=r;
        }while(r!=0);
        
        return a;
    }
    
    public static void main(String[] args) {
//        Rectangle r1=new Rectangle();
//        Rectangle r2=new Rectangle(3.5, 2.5);
//        System.out.println("A teglalap kerulete"+r1.getPerimeter());
//        System.out.println("A teglalap terulete"+r2.getArea());
//        System.out.println("A teglalap szelessege"+r2.getWidth());
//        System.out.println(r1);
//        Qequation e1= new Qequation(1,2,8);
//        Qequation e2= new Qequation(1,-4,4);
//        System.out.println("e1");
//        System.out.println("e2");
          System.out.println(Account.getAnnualRate());
          
          Account ac=new Account();
          ac.setId(123);
          ac.deposit(10000);
          System.out.println(ac.getBalance());
          ac.withdraw(4000);
          System.out.println(ac.getBalance());
          
          System.out.println(Fan.FAST);
          
          Fan f=new Fan();
          System.out.println(f);
          
          System.out.println(lnko(360,225));
    }
            
    
}
