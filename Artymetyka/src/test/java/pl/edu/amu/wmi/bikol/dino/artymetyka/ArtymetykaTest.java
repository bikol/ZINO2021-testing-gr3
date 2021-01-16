/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.wmi.bikol.dino.artymetyka;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bikol
 */
public class ArtymetykaTest {
    
    public ArtymetykaTest() {
    }

    @Test
    public void testMnozenie1() {
        System.out.println("mnozenie1");
        String a = "1";
        String b = "1";
        String expResult = "1";
        String result = Artymetyka.mnozenie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMnozenie2() {
        System.out.println("mnozenie2");
        String a = "1";
        String b = "0";
        String expResult = "0";
        String result = Artymetyka.mnozenie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMnozenie3() {
        System.out.println("mnozenie3");
        String a = "-1";
        String b = "-1";
        String expResult = "1";
        String result = Artymetyka.mnozenie(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMnozenie4() {
        System.out.println("mnozenie4");
        String a = "1";
        String b = "3";
        String expResult = "3";
        String result = Artymetyka.mnozenie(a, b);
        assertEquals(expResult, result);
    }
}
