/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan5.kambingglobal;

/**
 *
 * @author Lenovo
 * Nama     : RD Muhammad Djulfikar BU
 *  NIM      : 10117086
 *  Kelas    : IF3
 *  Minggu 23 september 2018
 */
public class PBO310117086Latihan5KambingGlobal {
    //variabel jumlahKambing menjadi jumlah instance
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahkambing() {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    public void tambahKambing() {
        
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah Kambing Setelah Ditambah: +"
                + jumlahKambing);
        
    }
        
    
    
    public static void main(String[] args) {
        PBO310117086Latihan5KambingGlobal kambingSusu = new
        PBO310117086Latihan5KambingGlobal();
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahkambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahkambing();
    }
    
}
