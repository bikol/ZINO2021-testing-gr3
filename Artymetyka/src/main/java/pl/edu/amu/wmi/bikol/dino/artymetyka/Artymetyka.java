/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.artymetyka;

/**
 *
 * @author bikol
 */
public class Artymetyka {
    
    public static String mnozenie(String a, String b){
        if(a.indexOf('/')!=-1 && (b.indexOf('/')!=-1))
        {
            char a1 = a.charAt(0);
            char a2 = a.charAt(2);
            char b1 = b.charAt(0);
            char b2 = b.charAt(2);
            
            double x1 = (double) Character.digit(a1, 10);
            double y1 = (double) Character.digit(a2, 10);
            
            double x2 = (double) Character.digit(b1, 10);
            double y2 = (double) Character.digit(b2, 10);
            double x = x1/y1;
            double y = x2/y2;
            return String.format("%s", (double)x*y);
            
        }
        else if(b.indexOf('/')!=-1)
        {
            /*char a1 = a.charAt(0);
            char a2 = a.charAt(2);*/
            char b1 = b.charAt(0);
            char b2 = b.charAt(2);
            double x=Integer.parseInt(a);
            //double x1 = (double) Character.digit(a1, 10);
            //double y1 = (double) Character.digit(a2, 10);
            double x2 = (double) Character.digit(b1, 10);
            double y2 = (double) Character.digit(b2, 10);
            //double x = x1*y1/10;
            double y = x2/y2;
            return String.format("%s", (double)x*y);       
        }
        else{
        double double_a = Double.parseDouble(a.trim());
        double double_b = Double.parseDouble(b.trim());
        if(double_a * double_b == (long) (double_a * double_b))
            return String.format("%d", (long) (double_a * double_b));
        else
            return String.format("%s", (double) Math.round(double_a * double_b * 1000000)/1000000);     
        }
    }
    
}
