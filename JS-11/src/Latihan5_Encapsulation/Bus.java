/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan5_Encapsulation;

/**
 *
 * @author ainir
 */
public class Bus {
   public int penumpang;
   public int maxPenumpang;
   
   public void cetak(){
       System.out.println("Penumpang Bus sekarang adalah " + penumpang);
       System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
   }
}
