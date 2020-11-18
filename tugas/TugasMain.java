/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author INDRAFN
 */
public class TugasMain {
    public static void main(String[] args){
        Singa s = new Singa("Roarr Roaaar", "Coklat", "CingaCing", 4);
        Keledai k = new Keledai("Hehehehe", "Abu - abu", "Kedelai", 4);
        Gorilla g = new Gorilla("Haaumm haauum", "Hitam manis", "Gulali", 4);
        
        k.displayData();
        g.displayData();
        s.displayData();
    }
}
