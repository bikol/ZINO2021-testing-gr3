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
        double double_a = Double.parseDouble(a.trim());
        double double_b = Double.parseDouble(b.trim());
        if(double_a * double_b == (long) (double_a * double_b))
            return String.format("%d", (long) (double_a * double_b));
        else
            return String.format("%s", (double) Math.round(double_a * double_b * 1000000)/1000000);     
    }
    
}
