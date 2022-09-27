/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class KonversiDataTipePrimitif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int age = 19;
    Integer ageObject = age;
    
    int ageAgain = ageObject;
    
    short shortAgain = ageObject.shortValue();
    byte byteAge = ageObject.byteValue();//konversi dari tipe primitif
    }
    
}
