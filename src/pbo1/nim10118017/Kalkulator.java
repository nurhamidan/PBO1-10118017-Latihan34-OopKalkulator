package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class yang berisi operasi aritmatika dari dua bilangan.
 * 
 */
public class Kalkulator {
    
    //Atribut class
    public double value1, value2;
    
    //Method penjumlahan
    public double tambahBilangan() {
        return value1 + value2;
    }
    
    //Method pengurangan
    public double kurangBilangan() {
        return value1 - value2;
    }
    
    //Method perkalian
    public double kaliBilangan() {
        return value1 * value2;
    }
    
    //Method pembagian
    public double bagiBilangan() {
        return value1 / value2;
    }
    
    //Method menampilkan sisa hasil bagi
    public double sisaBilangan() {
        return value1 % value2;
    }
    
}
