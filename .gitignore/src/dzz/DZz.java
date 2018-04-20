/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzz;

import java.math.BigDecimal;
import java.math.BigInteger;
/**
 *
 * @author nikit
 */
public class DZz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Group group1 = new Group();
        Student student1 = new Student();
        Student student2 = new Student();
        
        student1.NIkita = 10;
        student1.Maxim = 6;
        student1.Artiem = 8;
        
        System.out.println(student1.NIkita);
        System.out.println(student1.Maxim);
        System.out.println(student1.Artiem);
        
        student2.NIkita = 11;
        student2.Maxim = 16;
        student2.Artiem = 88;
        
        System.out.println(student2.NIkita);
        System.out.println(student2.Maxim);
        System.out.println(student2.Artiem);
        
        group1.SVH1018 = 1445;
        
        System.out.println(group1.SVH1018);
    }
    
}
