/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_KEL_8_NO_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Paulan
 */
public class Flowchart {
       public static void main(String[] args) {
        int a = 100;
        int b = 25;
        int hasil ;
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String input = JOptionPane.showInputDialog("Silahkan Memilih" );
           
                int pilihan = Integer.parseInt(input);                    
                 switch (pilihan){
                    case 1:
                         hasil = a+b;
                         System.out.println("Penjumlahan dari " +a+ " dan " +b+ " adalah : " + hasil);
                         break;
                         
                    case 2:
                         hasil = a-b;
                         System.out.println("Pengurangan dari " +a+ " dan " +b+ " adalah : " + hasil);
                         break;
                         
                    default:
                        System.out.println("Pilihan anda tidak ada");
                 }
    }
}