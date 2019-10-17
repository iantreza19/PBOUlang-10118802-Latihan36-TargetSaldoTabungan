/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tabungan tabungan = new Tabungan();

        tabungan.saldo = 3500000;
        tabungan.bunga = 8;
        int saldoTarget = 6000000;

        tabungan.HitungLamaSaldoTarget(tabungan.saldo,saldoTarget);
        
    }
    
}
