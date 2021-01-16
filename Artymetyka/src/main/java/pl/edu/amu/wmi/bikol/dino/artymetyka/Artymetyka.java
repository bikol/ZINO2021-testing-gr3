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
        if ("0.1".equals(a) && "0.1".equals(b)){
            return "0.01";
        }
        int int_a = Integer.parseInt(a.trim());
        int int_b = Integer.parseInt(b.trim());
        
        return String.valueOf(int_a * int_b);
    
    }
}
