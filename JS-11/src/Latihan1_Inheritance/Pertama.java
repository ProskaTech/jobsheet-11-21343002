/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1_Inheritance;

/**
 *
 * Crated By 21343002_Aini Rizkina
 */
public class Pertama {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info() {
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass() .getName());
    }
}
